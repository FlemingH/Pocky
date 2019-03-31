package indi.fleming.pocky.controller.main.user;

import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.service.main.user.MainUserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainUserAjaxController {

    @Autowired
    Message message;
    @Autowired
    MainUserSvc mainUserSvc;

    @RequestMapping(value = "/pejoy/main/user/modifyUserInfo", method = RequestMethod.POST)
    public Message addUser(@RequestParam("username") String username,
                           @RequestParam("user_info") String user_info) {
        Message message = mainUserSvc.modifyUser(username, user_info);
        return message;
    }

}
