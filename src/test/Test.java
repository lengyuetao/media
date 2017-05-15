import java.util.StringTokenizer;

/**
 * Created by zhangantao on 2017/4/21.
 */
public class Test {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("hello world say hello");
        String vesion="guankai撤消了中心华北计费中心网吧：3975,4023,4024,4038,4039,4040,4041,4042,4043,4044,4045,4046,4047,4149,4221,4261,4266,4267,4279,4282,4283,4299,4381,4428,的版本ICO_hmd";
        String key=vesion.substring(vesion.lastIndexOf("的版本")+3,vesion.length());

        System.out.println("*****"+vesion);

        System.out.println("vesion1:"+vesion.indexOf("中心网吧："));

        System.out.println("vesion2:"+vesion.lastIndexOf("的版本"));


        String value=vesion.substring(vesion.indexOf("中心网吧：")+5,vesion.lastIndexOf(",的版本"));
        System.out.println(value);


    }
}
