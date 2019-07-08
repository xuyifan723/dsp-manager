package com.xuyifan.dspmanager.interbean;

/**
 * @Classname ResultBean
 * @Description TODO
 * @Date 2019/7/4 0004 下午 4:55
 * @Created by XUYIFAN723
 */
public class ResultBean {
    public static final int SUCCESS_OK=0;
    public static final int ERROR=500;

    private String msg;
    private int code;
    private Object data;

    public ResultBean(String msg, int code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
