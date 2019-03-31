package indi.fleming.pocky.service.login;

import com.google.gson.Gson;
import indi.fleming.pocky.domain.Group;
import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.domain.User;
import indi.fleming.pocky.mapper.user.MainUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginSvcImpl implements LoginSvc{

    @Autowired
    MainUserMapper mainUserMapper;
    @Autowired
    Message message;
    @Autowired
    Gson gson;

    @Override
    public Message checkInfo(String username, String password) {

        User user = mainUserMapper.selectUser(username);

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

        // alright return user json string for router
        } else {
            message.setMessageState("success");
            message.setMessageData(gson.toJson(user));
        }

        return message;
    }

    @Override
    public Message addUser(String username, String password, String role_code, String group_code, String user_info) {

        int i = mainUserMapper.insertUser(username, password, role_code, group_code, user_info);
        message.setMessageState("success");
        message.setMessageData(i+"");

        return message;
    }

    @Override
    public List<Group> fetchGroupList() {
        List<Group> groupList = mainUserMapper.selectGroupList();
        return groupList;
    }

}
