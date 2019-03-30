package indi.fleming.pocky.controller.index;

import indi.fleming.pocky.domain.Group;
import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.service.login.LoginSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//only handle ajax from pejoy
public class LoginAjaxController {

    @Autowired
    Message message;
    @Autowired
    LoginSvc loginSvc;

    @RequestMapping(value = "/pejoy/login/checkInfo", method = RequestMethod.POST)
    public Message checkInfo(@RequestParam("username") String username,
                             @RequestParam("password") String password) {
        Message message = loginSvc.checkInfo(username, password);
        return message;
    }

    @RequestMapping(value = "/pejoy/login/addUser", method = RequestMethod.POST)
    public Message addUser(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           @RequestParam("role_code") String role_code,
                           @RequestParam("group_code") String group_code,
                           @RequestParam("user_info") String user_info) {
        Message message = loginSvc.addUser(username, password, role_code, group_code, user_info);
        return message;
    }

    @RequestMapping(value = "/pejoy/login/fetchGroupList", method = RequestMethod.POST)
    public List<Group> fetchGroupList() {
        List<Group> groupList = loginSvc.fetchGroupList();
        return groupList;
    }
}
