package com.xuyifan.dspmanager.exception;

import com.xuyifan.dspmanager.util.StrUtil;

/**
 * dsp异常处理类
 */
public class DspException extends RuntimeException {
    public DspException() {
    } //用来创建无参数对象

    public DspException(String message) { //用来创建指定参数对象
        super(message); //调用超类构造器
    }

    public DspException(Object... msg) {
        super(StrUtil.getMsg("\\{s%\\}", msg));
    }

}
