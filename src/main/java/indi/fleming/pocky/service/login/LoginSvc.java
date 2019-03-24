package indi.fleming.pocky.service.login;

import indi.fleming.pocky.domain.Message;

public interface LoginSvc {

    Message checkLoginInfo(String username, String password);

}
