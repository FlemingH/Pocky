package indi.fleming.pocky.mapper.main.user;

import indi.fleming.pocky.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainUserMapper {

    @Update("update user set user_info = #{user_info} where username = #{username}")
    int updateUser(@Param("username")String username,
                   @Param("user_info")String user_info);

    @Select("select * from user")
    List<User> selectUserList();

}
