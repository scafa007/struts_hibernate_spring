package ma.sqli.echalling.sample.action;

import com.opensymphony.xwork2.ActionSupport;
import ma.sqli.echalling.sample.service.UserService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Namespace("/")
@ResultPath("/")
public class IndexAction extends ActionSupport {
    private String username;
    private String password;

    private UserService userService;

    @Action(value = "index", results = {
            @Result(name = "success", location = "/success.html"),
            @Result(name = "error", location = "/error.html")
    })
    public String execute() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        authentication.getPrincipal();


        return ERROR;
    }

    public UserService getUserService() {
        return userService;
    }

    public String getUsername() {
        return username;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
