package com.vayne.allpay.distributed.lock.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/6/5 17:57
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Service
@Slf4j
public class DistributedLockByZookeeper implements InitializingBean {

    @Autowired
    private CuratorFramework curatorFramework;

    /**
     * 获取分布式锁
     * @param path
     */
    public void acquireDistributedLock(String path) {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
