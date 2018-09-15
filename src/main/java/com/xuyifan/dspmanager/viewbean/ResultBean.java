package com.xuyifan.dspmanager.viewbean;

public class ResultBean {
    private Integer err = 0;
    private String msg;
    private Object data;
    public static final Integer OK = 200;
    public static final Integer ERROR = 500;
    public static final ResultBean SUCESS = new ResultBean(null, ResultBean.OK, null);

    public ResultBean(Object data, Integer err, String msg) {
        this.data = data == null ? new Object() : data;
        this.err = err;
        this.msg = (msg == null) ? new String() : msg;
    }

    public ResultBean(Object data) {
        this.data = data == null ? new Object() : data;
        this.err = ResultBean.OK;
        this.msg = "";
    }

    public Integer getErr() {
        return err;
    }

    public void setErr(Integer err) {
        this.err = err;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
