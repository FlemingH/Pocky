package indi.fleming.pocky.service.login;

import indi.fleming.pocky.domain.Message;

public interface LoginSvc {

    Message checkInfo(String username, String password);
    Message addUser(String username, String password, String role_code, String user_info);

}
