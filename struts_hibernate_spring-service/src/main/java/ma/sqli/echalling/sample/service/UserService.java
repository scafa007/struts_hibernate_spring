package ma.sqli.echalling.sample.service;

import ma.sqli.echalling.sample.dao.UserDao;
import ma.sqli.echalling.sample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService extends GenericService<User, String> {

    public UserService() {
    }

    @Autowired
    public void setDao(UserDao dao) {
        super.setDao(dao);
    }

    public User connect(String username, String password){

        User user = get(username);

        if (user == null)
            return null;

        if (user.getPassword() == null)
            user.setPassword("");

        if (user.getPassword().equals(password)){
            return user;
        }

        return null;
    }
}
