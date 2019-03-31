package indi.fleming.pocky.mapper.user;

import indi.fleming.pocky.domain.Group;
import indi.fleming.pocky.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainUserMapper {

    @Insert({"insert into user(username, password, role_code, group_code, user_info) " +
            "values(#{username}, #{password}, #{role_code}, #{group_code}, #{user_info})"})
        // @Param use for multi-param
    int insertUser(@Param("username")String username,
                   @Param("password")String password,
                   @Param("role_code")String role_code,
                   @Param("group_code")String group_code,
                   @Param("user_info")String user_info);

    @Delete("delete from user where username = #{username}")
    int deleteUser(@Param("username")String username);

    @Update("update user set user_info = #{user_info} where username = #{username}")
    int updateUser(@Param("username")String username,
                   @Param("user_info")String user_info);

    @Select("select * from user where username = #{username}")
    User selectUser(String username);

    @Select("select * from user")
    List<User> selectUserList();

    @Select("select * from user_group")
    List<Group> selectGroupList();

}
