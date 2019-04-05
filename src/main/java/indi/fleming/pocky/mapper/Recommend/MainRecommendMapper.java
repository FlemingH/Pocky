package indi.fleming.pocky.mapper.Recommend;

import indi.fleming.pocky.domain.Recommend;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface MainRecommendMapper {

    @Select("select * from recommend where group_code = #{group_code}")
    List<Recommend> selectRecommendByGroup(String group_code);

    @Insert({"insert into recommend(recommend_id, group_code, recommend_info, recommend_time) " +
            "values(#{recommend_id}, #{group_code}, #{recommend_info}, #{recommend_time})"})
    int addRecommend(@Param("recommend_id")String recommend_id,
                     @Param("group_code")String group_code,
                     @Param("recommend_info")String recommend_info,
                     @Param("recommend_time")BigInteger recommend_time);

}
