package com.xuyifan.dspmanager.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Xu yifan
 * @Ddecription 待写
 * @date 2019/8/13 9:46
 * @Version 1.0
 */
@Setter
@Getter
public class UserException extends RuntimeException {

    private Integer code;


    public UserException(String msg) {

        super(msg);

    }


    public UserException(Integer code, String msg) {

        super(msg);

        this.code = code;

    }

}
