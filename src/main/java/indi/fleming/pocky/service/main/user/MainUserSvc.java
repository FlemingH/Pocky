package indi.fleming.pocky.service.main.user;

import indi.fleming.pocky.domain.Message;

public interface MainUserSvc {

    Message modifyUser(String username, String user_info);

}
