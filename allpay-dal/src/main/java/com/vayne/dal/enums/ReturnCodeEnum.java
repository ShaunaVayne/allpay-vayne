package com.vayne.dal.enums;

import com.vayne.dal.base.BaseEnum;

public enum ReturnCodeEnum implements BaseEnum {
    //成功返回码
    SUCCESS(10000, "成功"),
    FAIL(99999, "失败"), ;

    private int    code;

    private String desc;

    private ReturnCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
