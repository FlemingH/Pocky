package indi.fleming.pocky.controller.login;

import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.service.login.LoginSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//only handle ajax from pejoy
public class LoginAjaxController {

    @Autowired
    Message message;
    @Autowired
    LoginSvc loginSvc;

    @RequestMapping(value = "/checkLoginInfo", method = RequestMethod.POST)
    public Message checkLoginInfo(@RequestParam("username") String username,
                                 @RequestParam("password") String password) {
        Message message = loginSvc.checkLoginInfo(username, password);
        return message;
    }

}
