package com.xuyifan.dspmanager.exception;

/**
 * dsp异常处理类
 */
public class DspException extends Exception {
    public DspException() {} //用来创建无参数对象
    public DspException(String message) { //用来创建指定参数对象
        super(message); //调用超类构造器
    }
}
