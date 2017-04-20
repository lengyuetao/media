import com.tao.entity.UserInfo;
import com.tao.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhangantao on 2017/4/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/applicationContext-datasource.xml"})
public class UserInfTest {

    @Autowired
    UserInfoService userInfoService;

    @Test
    public void findUserInfo(){
       UserInfo userInfo=userInfoService.findUserInfoById(2);
        System.out.println(userInfo.toString());
    }
}
