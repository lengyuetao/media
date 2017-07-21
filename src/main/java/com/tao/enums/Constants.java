package com.tao.enums;

/**
 * Created by DELL on 2017/7/17.
 */
public enum Constants {


    SUCCESS(0),FAIL(1);

    private int status;

    private Constants(int status){
        this.status=status;
    }

    public int getStatus(){
        return  status;
    }

    public static void main(String[] args) {
        System.out.println(Constants.SUCCESS.status);
    }
}
