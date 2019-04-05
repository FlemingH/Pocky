package indi.fleming.pocky.service.main.recommend;

import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.domain.Recommend;
import indi.fleming.pocky.mapper.Recommend.MainRecommendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class MainRecommendSvcImpl implements MainRecommendSvc{

    @Autowired
    Message message;
    @Autowired
    MainRecommendMapper mainRecommendMapper;

    @Override
    public List<Recommend> fetchRecommendByGroup(String group_code) {
        List<Recommend> recommendList = mainRecommendMapper.selectRecommendByGroup(group_code);
        return recommendList;
    }

    @Override
    public Message recommendBook(String recommend_id, String group_code, String recommend_info, BigInteger recommend_time) {
        int i = mainRecommendMapper.addRecommend(recommend_id, group_code, recommend_info, recommend_time);
        message.setMessageState("success");
        message.setMessageData(i+"");
        return message;
    }

}
