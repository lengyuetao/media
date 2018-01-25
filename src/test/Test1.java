import java.text.DecimalFormat;
import java.util.Locale;

/**
 * Created by DELL on 2017/10/12.
 */
public class Test1 {
    public boolean get(){
        int a=0,b=3;
        return a>3;
    }
    public static void main(String[] args) {
//        System.out.println(Locale.getDefault());
//        String str="knsdasdf";
//        byte[] bytes=str.getBytes();
//
//        for (byte b:bytes){
//            System.out.println(b);
//        }
//
//        String st=new  String(bytes);
//        System.out.println("****"+st);
//
//        int a=001;
//        Integer b=001;
//
//        System.out.println("*****"+a);
//        System.out.println("*****"+b);

        int a=1345;
        DecimalFormat df=new DecimalFormat("0000");
        System.out.println(df.format(a));

        String str="<div style='width:1152px ;height: 624px;background: url(http://kp-oss.img-cn-shenzhen.aliyuncs.com/contants/email_bg.jpg);'>\n" +
                "\t\t\t<div style='height: 260px;width: 430px;top: 305px; position: relative;left: 355px;text-align: center;' >\n" +
                "\t\t\t\t<p style='font-size: 35px;color: #333;text-align: left;margin: 20px 0 20px ;'>您好</p >\n" +
                "\t\t\t\t<p style=' font-size: 14px;color: #333;margin: 0;'>您的帳戶在NiuBCoin交易所提交了找回密碼申請。<br />請複製一下驗證碼到驗證頁面粘貼，並進行下一步處理。</p >\n" +
                "\t\t\t\t<h2 style='margin: 30px 0; font-size: 36px;'>DFDEEFE</h2>\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>";

    }
}
