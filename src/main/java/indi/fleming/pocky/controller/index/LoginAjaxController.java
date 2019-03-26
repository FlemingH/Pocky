package indi.fleming.pocky.controller.index;

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

    @RequestMapping(value = "/pejoy/index/checkInfo", method = RequestMethod.POST)
    public Message checkInfo(@RequestParam("username") String username,
                             @RequestParam("password") String password) {
        Message message = loginSvc.checkInfo(username, password);
        return message;
    }

    @RequestMapping(value = "/pejoy/index/addUser", method = RequestMethod.POST)
    public Message addUser(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           @RequestParam("role_code") String role_code,
                           @RequestParam("user_info") String user_info) {
        Message message = loginSvc.addUser(username, password, role_code, user_info);
        return message;
    }
}
