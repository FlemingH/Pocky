package indi.fleming.pocky.service.login;

import indi.fleming.pocky.domain.Group;
import indi.fleming.pocky.domain.Message;

import java.util.List;

public interface LoginSvc {

    Message checkInfo(String username, String password);
    Message addUser(String username, String password, String role_code, String group_code, String user_info);
    List<Group> fetchGroupList();

}
