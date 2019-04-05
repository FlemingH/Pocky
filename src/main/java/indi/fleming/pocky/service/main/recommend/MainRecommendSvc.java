package indi.fleming.pocky.service.main.recommend;

import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.domain.Recommend;

import java.math.BigInteger;
import java.util.List;

public interface MainRecommendSvc {

    List<Recommend> fetchRecommendByGroup(String group_code);
    Message recommendBook(String recommend_id, String group_code, String recommend_info, BigInteger recommend_time);

}
