package indi.fleming.pocky.service.main.user;

import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.domain.User;

import java.util.List;

public interface MainUserSvc {

    Message modifyUser(String username, String user_info);
    List<User> fetchUserList();

}
