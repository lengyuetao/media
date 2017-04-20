
import com.tao.entity.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by zhangantao on 2017/4/18.
 */
public class MybatisTest {
    public static void main(String[] args) {
        String resouce= "mybatis/mybatis-config.xml";

        try {
            URL url=MybatisTest.class.getClassLoader().getResource("a.txt");
            System.out.printf(url.getPath());

            InputStream is = Resources.getResourceAsStream(resouce);
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

            SqlSession session=sessionFactory.openSession();

            String statement="com.tao.entity.UserInfo.getUserInfo";

            UserInfo userInfo=session.selectOne(statement,1);
            System.out.println(userInfo.getUserName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
