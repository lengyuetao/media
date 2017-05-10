import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * Created by zhangantao on 2017/4/21.
 */
public class ShiroTest {
    public static void main(String[] args) {

        Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro.ini");

        SecurityManager securityManager=factory.getInstance();

        SecurityUtils.setSecurityManager(securityManager);

        Subject subject=SecurityUtils.getSubject();

        UsernamePasswordToken token=new UsernamePasswordToken("zat","123");

        subject.login(token);


        boolean flage=subject.isAuthenticated();
        if(flage){
            System.out.println("成功登录");
        }
        subject.logout();
    }
}



