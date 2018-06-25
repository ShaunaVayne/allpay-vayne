package cn.vayne.datasource.common;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;

/**
 * @Author: WangKun
 * @Description: 解决多线程访问全局变量的问题
 * @Date: Created in 2018/6/25 下午5:31
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Slf4j
public class DynamicDataSourceContextHolder {

	private static final ThreadLocal<DataSourceKey> currentDataSource = new ThreadLocal<>();

	/**
	 * 清除当前数据源
	 */
	public static void clear() {currentDataSource.remove();}

	/**
	 * 获取当前数据源
	 */
	public static DataSourceKey get() { return currentDataSource.get();}

	/**
	 * 设置当前使用的数据源
	 */
	public static void set(DataSourceKey dataSource){currentDataSource.set(dataSource);}

	/**
	 * 设置从库读取数据
	 */
	public static void setSlave() {
		if(RandomUtils.nextInt(0,2) > 0) {
			DynamicDataSourceContextHolder.set(DataSourceKey.DB_SAAS_SHOP);
		}else {
			DynamicDataSourceContextHolder.set(DataSourceKey.DB_SAAS);
		}
	}

}
