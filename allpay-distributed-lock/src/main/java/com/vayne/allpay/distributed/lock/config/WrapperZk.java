package com.vayne.allpay.distributed.lock.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/6/5 17:49
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "curator")
public class WrapperZk {

    private int retryCount;

    private int elapsedTimeMs;

    private String connectString;

    private int sessionTimeoutMs;

    private int connectionTimeoutMs;
}
