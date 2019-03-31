package indi.fleming.pocky.service.main.user;

import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.mapper.main.user.MainUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
