package cn.vayne.datasource.common;

import cn.vayne.datasource.annotation.TargetDataSource;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: WangKun
 * @Description:	数据源切面类
 * @Date: Created in 2018/6/25 下午7:03
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Slf4j
@Aspect
@Order(-1)
@Component
public class DynamicDataSourceAspect {

	@Pointcut("execution(* cn.vayne.datasource.manager.*.list*(..))")
	public void pointCut() {
	}

	/**
	 * 执行方法前切换数据源
	 * @param joinPoint
	 * @param targetDataSource
	 */
	@Before("@annotation(targetDataSource)")
	public void doBefore(JoinPoint joinPoint, TargetDataSource targetDataSource){
		DataSourceKey dataSourceKey = targetDataSource.dataSourceKey();
		//使用默认的数据源
		log.info("设置数据源{}",DataSourceKey.DB_MASTER);
		DynamicDataSourceContextHolder.set(dataSourceKey);
	}

	@After("@annotation(targetDataSource)")
	public void doAfter(JoinPoint joinPoint, TargetDataSource targetDataSource) {
		log.info("当前数据源 {}执行方法", targetDataSource.dataSourceKey());
		DynamicDataSourceContextHolder.clear();
	}

	@Before(value = "pointCut()")
	public void doBeforeWithSlave(JoinPoint joinPoint) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		// 获取当前节点对象
		Method method = methodSignature.getMethod();
		if(method.getDeclaringClass().isInterface()) { //判断是否是接口方法
			try {
				//获取实际类型的方法对象
				method = joinPoint.getTarget().getClass()
						.getDeclaredMethod(joinPoint.getSignature().getName(),method.getParameterTypes());
			}catch(Exception e) {
			  	log.error("方法不存在{}",e);
			}
		}
		if (null == method.getAnnotation(TargetDataSource.class)) {
			DynamicDataSourceContextHolder.setSlave();
		}
	}



}
