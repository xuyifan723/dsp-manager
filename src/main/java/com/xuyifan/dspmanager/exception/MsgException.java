package com.xuyifan.dspmanager.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Xu yifan
 * @Ddecription 待写
 * @date 2019/8/22 10:01
 * @Version 1.0
 */
@Setter
@Getter
public class MsgException extends RuntimeException{
    private Integer code;


    public MsgException(String msg) {

        super(msg);

    }


    public MsgException(Integer code, String msg) {

        super(msg);

        this.code = code;

    }

}
