package cn.vayne.datasource.annotation;

import cn.vayne.datasource.common.DataSourceKey;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: WangKun
 * @Description:	使用aop切换数据源,自定义注解的方式知道具体切换哪个数据源
 * @Date: Created in 2018/6/25 下午7:00
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TargetDataSource {
	DataSourceKey dataSourceKey() default DataSourceKey.DB_MASTER;
}
