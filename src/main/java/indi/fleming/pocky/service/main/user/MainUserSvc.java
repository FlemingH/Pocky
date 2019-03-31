package indi.fleming.pocky.service.main.user;

import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.domain.Role;
import indi.fleming.pocky.domain.User;

import java.util.List;

public interface MainUserSvc {

    Message modifyUserInfo(String username, String user_info);
    Message modifyUser(String username, String password, String role_code, String group_code);
    List<User> fetchUserList();
    List<Role> fetchRoleList();
    Message removeUser(String username);

}
