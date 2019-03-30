package indi.fleming.pocky.mapper.login;

import indi.fleming.pocky.domain.Group;
import indi.fleming.pocky.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginMapper {

    @Select("select * from user where username = #{username}")
    User selectUser(String username);

    @Insert({"insert into user(username, password, role_code, group_code, user_info) " +
            "values(#{username}, #{password}, #{role_code}, #{group_code}, #{user_info})"})
    // @Param use for multi-param
    int insertUser(@Param("username")String username,
                   @Param("password")String password,
                   @Param("role_code")String role_code,
                   @Param("group_code")String group_code,
                   @Param("user_info")String user_info);

    @Select("select * from user_group")
    List<Group> selectGroupList();
}
