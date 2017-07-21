package com.tao.utils.caches;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhangantao on 2017/7/14.
 */
public class CacheUtils {
    public static void main(String[] args) {
//        JSONObject json=new JSONObject();
//        json.put("name","aaa");
//        json.put("pwd","123");
//        json.put("address","福田");
//
//        JSONObject json1=new JSONObject();
//        json1.put("name","bbb");
//        json1.put("pwd","321");
//        json1.put("address","南山");
//
//        JSONObject json2=new JSONObject();
//        json2.put("name","ccc");
//        json2.put("pwd","456");
//        json2.put("address","龙华");
//
//        JSONObject json3=new JSONObject();
//        json3.put("name","ddd");
//        json3.put("pwd","890");
//        json3.put("address","龙岗");
//        JSONArray jst=new JSONArray(4);
//        jst.add(json);
//        jst.add(json2);
//        jst.add(json1);
//        jst.add(json3);
//        System.out.println(jst.toString());
//
//        JSONArray ss=new JSONArray();
//        for (int i=0;i<jst.size();i++){
//            JSONObject obj=jst.getJSONObject(i);
//            if(obj.get("pwd").equals("890")){
//                ss.add(5);
//            }
//        }

        List<String> list=new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for(String str:list){
            System.out.println(str);
        }

        List<String> myList=new ArrayList<String>();
    }
}
