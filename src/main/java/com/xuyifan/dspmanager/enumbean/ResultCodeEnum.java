package com.xuyifan.dspmanager.enumbean;

import lombok.Getter;


@Getter
public enum ResultCodeEnum {
    USER_EXCEPTION(403,"用户没登陆"),
    MSG_EXCEPTION(500,"系统异常");
    private int code;
    private String title;

    ResultCodeEnum(int code, String title) {
        this.code = code;
        this.title = title;
    }
}
