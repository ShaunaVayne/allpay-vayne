package cn.vayne.datasource.configuration;

import cn.vayne.datasource.common.DataSourceKey;
import cn.vayne.datasource.common.DynamicRoutingDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * @Author: WangKun
 * @Description:	配置数据源
 * @Date: Created in 2018/6/25 下午5:48
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Configuration
@MapperScan("cn.vayne.datasource.dao")
public class DynamicDataSourceConfiguration {

	@Bean
	@ConfigurationProperties(prefix = "multiple.datasource.master")
	public DataSource dbMaster() {return DruidDataSourceBuilder.create().build(); }

	@Bean
	@ConfigurationProperties(prefix = "multiple.datasource.saas")
	public DataSource dbSaas() {return DruidDataSourceBuilder.create().build();}

	@Bean
	@ConfigurationProperties(prefix = "multiple.datasource.saas_shop")
	public DataSource dbSaasShop() {return DruidDataSourceBuilder.create().build();}

	/**
	 * 核心动态数据源
	 */
	@Bean
	public DataSource dynamicDataSource() {
		DynamicRoutingDataSource dataSource = new DynamicRoutingDataSource();
		dataSource.setDefaultTargetDataSource(dbMaster());
		HashMap<Object, Object> dataSourceMap = new HashMap<>();
		dataSourceMap.put(DataSourceKey.DB_MASTER,dbMaster());
		dataSourceMap.put(DataSourceKey.DB_SAAS, dbSaas());
		dataSourceMap.put(DataSourceKey.DB_SAAS_SHOP,dbSaasShop());
		dataSource.setTargetDataSources(dataSourceMap);
		return dataSource;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dynamicDataSource());
		// 设置找不到mapper文件的问题
		sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}

	@Bean
	public SqlSessionTemplate sqlSessionTemplate() throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory());
	}

	/**
	 * 事务处理
	 */
	public PlatformTransactionManager platformTransactionManager() {
		return new DataSourceTransactionManager(dynamicDataSource());
	}

}
