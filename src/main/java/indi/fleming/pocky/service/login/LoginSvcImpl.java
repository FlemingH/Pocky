package indi.fleming.pocky.service.login;

import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.domain.User;
import indi.fleming.pocky.mapper.login.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginSvcImpl implements LoginSvc{

    @Autowired
    LoginMapper loginMapper;
    @Autowired
    Message message;

    @Override
    public Message checkLoginInfo(String username, String password) {

        User user = loginMapper.selectUser(username);

        // no this user
        if(user == null) {
            message.setMessageState("fail");
            message.setMessageData("data not found");

        // missing data
        } else if("".equals(user.getPassword())){
            message.setMessageState("fail");
            message.setMessageData("db error");

        // password not right
        } else if(!password.equals(user.getPassword())) {
            message.setMessageState("fail");
            message.setMessageData("data error");

        // alright
        } else {
            message.setMessageState("success");
            message.setMessageData("");
        }

        return message;
    }

}
