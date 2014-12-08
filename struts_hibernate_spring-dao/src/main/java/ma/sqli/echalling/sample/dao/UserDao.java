package ma.sqli.echalling.sample.dao;

import ma.sqli.echalling.sample.model.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao extends GenericDao<User, String>{

    public UserDao() {
        super(User.class);
    }

    @Override
    public User get(String id) {
        if (id.equalsIgnoreCase("user")){
            return new User("user","password");
        }
        return null;
    }
}
