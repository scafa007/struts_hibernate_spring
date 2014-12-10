package ma.sqli.echalling.sample.dao;

import ma.sqli.echalling.sample.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-dao.xml");

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        User user = userDao.get("username");

        System.out.println(user.toString());
    }
}
