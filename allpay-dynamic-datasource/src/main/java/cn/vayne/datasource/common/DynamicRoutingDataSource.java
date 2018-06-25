package cn.vayne.datasource.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author: WangKun
 * @Description: 设置数据源
 * @Date: Created in 2018/6/25 下午5:46
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Slf4j
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		log.info("当前数据源:{}",DynamicDataSourceContextHolder.get());
		return DynamicDataSourceContextHolder.get();
	}
}
