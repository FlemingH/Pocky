package indi.fleming.pocky.mapper.Recommend;

import indi.fleming.pocky.domain.Recommend;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainRecommendMapper {

    @Select("select * from recommend where group_code = #{group_code}")
    List<Recommend> selectRecommendByGroup(String group_code);

}
