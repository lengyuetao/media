package com.tao.enums;

/**
 * Created by DELL on 2017/7/17.
 */
public enum  EnumTest {
    CHINA("中国"),JAPAN("日本"),AMERIGAN("美国");

    private  String cuntry;

    private EnumTest( String cuntry){
        this.cuntry=cuntry;
    }

    public  String getCuntry(){
        return cuntry;
    }

    public static void main(String[] args) {
        System.out.println(EnumTest.CHINA.cuntry);
    }
}
