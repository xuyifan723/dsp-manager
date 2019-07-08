package com.xuyifan.dspmanager.util;

import org.apache.commons.lang.StringUtils;

/**
 * @Classname StrUtil
 * @Description TODO
 * @Date 2019/7/8 0008 下午 1:25
 * @Created by XUYIFAN723
 */
public class StrUtil {
    /**
     *替换字符串，将字符串中的固定字符的替换
     * @param msg
     * @return
     */
    public static String getMsg(String regex,Object... msg){
        StringBuilder str=new StringBuilder();
        int index=1;
        String msginfo=" "+(String) msg[0]+" ";
        String[] strArray=null;
        if (StringUtils.isNotEmpty(msginfo)){
            strArray = msginfo.split(regex);
        }
        for (String msgStr : strArray) {
           str.append(msgStr);
           if (msg.length-1>index){
               str.append(msg[index]);
           }
            index++;
        }
        String result=str.toString().replaceFirst(" ","");
        return result.substring(0,result.length()-1);
    }
}
