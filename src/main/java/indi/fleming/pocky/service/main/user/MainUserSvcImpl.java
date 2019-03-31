package indi.fleming.pocky.service.main.user;

import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.domain.User;
import indi.fleming.pocky.mapper.user.MainUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainUserSvcImpl implements MainUserSvc{

    @Autowired
    MainUserMapper mainUserMapper;
    @Autowired
    Message message;

    @Override
    public Message modifyUser(String username, String user_info) {

        int i = mainUserMapper.updateUser(username, user_info);
        message.setMessageState("success");
        message.setMessageData(i+"");

        return message;
    }

    @Override
    public List<User> fetchUserList() {
        List<User> userList = mainUserMapper.selectUserList();
        return userList;
    }

    @Override
    public Message removeUser(String username) {

        int i = mainUserMapper.deleteUser(username);
        message.setMessageData(i+"");
        message.setMessageState("success");

        return message;
    }

}
