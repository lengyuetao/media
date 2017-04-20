package com.tao.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangantao on 2017/4/20.
 */
public class EncryUtils {
	private static final int KEY=0x07;
	public String encrypt(String data){
		
		StringBuffer str=new StringBuffer();
		for(int i=0;i<data.length();i++){
			char c=(char)(data.charAt(i)^KEY);
			str.append(c);
		}
		return str.toString();
	}
	
	public String decript(String data){
		StringBuffer str=new StringBuffer();
		  for(int i=0;i<data.length();i++)
          {
              char c = (char)(data.charAt(i) ^ KEY);
              str.append(c);
          }
		return str.toString();
	}
	
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("name", "sss");
		map.put("pwd", "123");
		map.put("age", "23");
		System.out.println(new EncryUtils().encrypt(map.toString()));
		System.out.println(new EncryUtils().decript(new EncryUtils().encrypt(map.toString())));
		System.out.println(new EncryUtils().decript("sdfasdfads"));
	}
}
