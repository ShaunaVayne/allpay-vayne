package com.vayne.allpay.distributed.lock.bean;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2019/6/10 17:36
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
public class RespMsg<T> {

    private Boolean success;

    public RespMsg() {
    }

    public RespMsg(Boolean success) {
        this.success = success;
    }

    public static RespMsg<Boolean> success(Boolean flag) {
        return new RespMsg(flag) ;
    }
}
