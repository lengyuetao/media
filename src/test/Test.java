import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by zhangantao on 2017/4/21.
 */
public class Test {
    public static void main(String[] args) {
//        StringTokenizer st=new StringTokenizer("hello world say hello");
//        String vesion="guankai撤消了中心华北计费中心网吧：3975,4023,4024,4038,4039,4040,4041,4042,4043,4044,4045,4046,4047,4149,4221,4261,4266,4267,4279,4282,4283,4299,4381,4428,的版本ICO_hmd";
//        String key=vesion.substring(vesion.lastIndexOf("的版本")+3,vesion.length());
//
//        System.out.println("*****"+vesion);
//
//        System.out.println("vesion1:"+vesion.indexOf("中心网吧："));
//
//        System.out.println("vesion2:"+vesion.lastIndexOf("的版本"));
//
//
//        String value=vesion.substring(vesion.indexOf("中心网吧：")+5,vesion.lastIndexOf(",的版本"));
//        System.out.println(value);
//
//        String json="{\"home\":\"skasdsfasdf\",\"pwd\":123123,\"address\":\"lskdfasdfasddf\"}";

        //language=JSON
        String str="";

        System.out.println(Math.asin(10>>4/3));


        List<String> list=new ArrayList<String>();

        list.add("kks");
        list.add("bbs");
        list.add("ccs");
        list.add("ees");

        Person person=new Person();
        person.setId(1);
        person.setUserName("kksdfa");
        person.setPwd("12312");
        person.setAddTime(new Date());

        System.out.println("对象："+person.toString()+"\n哈希值："+person.hashCode());

        try {
            Person p= (Person) person.clone();
            System.out.println("克隆对象："+p.toString()+"\n哈希值："+p.hashCode());
            System.out.println(person==p);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        System.out.println(Math.random());

        Object obj=new Object();

        Test t=new Test();


    }

    public Test(){
        URL url=getClass().getClassLoader().getResource("redis.properties");
        System.out.println("url地址："+url);
    }
}
