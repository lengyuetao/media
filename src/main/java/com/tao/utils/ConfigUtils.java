package com.tao.utils;

import java.util.ResourceBundle;

/**
 * Created by DELL on 2017/10/9.
 *
 *读取配置文件
 */
public class ConfigUtils {
    public static final ResourceBundle bundle=ResourceBundle.getBundle("config");

    /**
     * 根据key读取配置
     * @param key
     * @return
     */
    public static String getVal(String key){
        return bundle.getString(key);
    }

    public static void main(String[] args) {
        System.out.println(ConfigUtils.getVal("ZAT_WX_USER"));
    }
}
