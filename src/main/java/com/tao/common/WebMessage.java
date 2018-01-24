package com.tao.common;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by cloud on 2017/10/11.
 */
public class WebMessage {

    private static Map<Locale,ResourceBundle> bundles = new HashMap<>(3);

    static{
        Locale myLocale = Locale.CHINA;
        bundles.put(myLocale,ResourceBundle.getBundle("message",myLocale));
        //bundles.put(Locale.US,ResourceBundle.getBundle("message",Locale.US));
        //bundles.put(Locale.TRADITIONAL_CHINESE,ResourceBundle.getBundle("message",Locale.TRADITIONAL_CHINESE));
    }
    public WebMessage(){
    }

    public static String getMsg(String code){
        String msg = bundles.get(Locale.CHINA).getString(code);
        return msg;//sascToUtf8(msg);
    }

    public static String getMsg(String code,Locale locale){
        ResourceBundle bundle = bundles.get(locale);
        if(bundle != null){
            return bundle.getString(code);//ascToUtf8(bundle.getString(code));
        }else{
            return "";
        }
    }


    private static String ascToUtf8(String asc){
        try {
            return new String(asc.getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
