package ma.sqli.echalling.sample.dao;

import ma.sqli.echalling.sample.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDao extends GenericDao<User, String>{

    public UserDao() {
        super(User.class);
    }

    @Override
    public User get(String id) {
        List list = getHibernateTemplate().find(
                "from User where username=?", id
        );
        return (User)list.get(0);
    }
}
