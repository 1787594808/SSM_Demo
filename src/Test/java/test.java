import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class test {

    @SuppressWarnings("resource")
    @Test
    public static void main(String[] args) throws SQLException {
        ApplicationContext ac = null;
        ac = new ClassPathXmlApplicationContext("classpath:/spring/spring-dao.xml");
        DataSource bean = ac.getBean(DataSource.class);
        Connection connection = bean.getConnection();

        System.out.println("数据库信息：" + connection);
    }
}