package indi.fleming.pocky.mapper.login;

import indi.fleming.pocky.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    @Select("select * from user where username = #{username}")
    User selectUser(String username);

}
