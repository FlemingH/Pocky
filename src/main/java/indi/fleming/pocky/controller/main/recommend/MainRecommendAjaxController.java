package indi.fleming.pocky.controller.main.recommend;

import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.domain.Recommend;
import indi.fleming.pocky.service.main.recommend.MainRecommendSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
public class MainRecommendAjaxController {

    @Autowired
    Message message;
    @Autowired
    MainRecommendSvc mainRecommendSvc;

    @RequestMapping(value = "/pejoy/main/recommend/fetchRecommendByGroup", method = RequestMethod.POST)
    public List<Recommend> fetchRecommendByGroup(@RequestParam("group_code") String group_code) {
        List<Recommend> recommendList = mainRecommendSvc.fetchRecommendByGroup(group_code);
        return recommendList;
    }

    @RequestMapping(value = "/pejoy/main/recommend/recommendBook", method = RequestMethod.POST)
    public Message recommendBook(@RequestParam("recommend_id") String recommend_id,
                                 @RequestParam("group_code") String group_code,
                                 @RequestParam("recommend_info") String recommend_info,
                                 @RequestParam("recommend_time") BigInteger recommend_time) {
        Message message = mainRecommendSvc.recommendBook(recommend_id, group_code, recommend_info, recommend_time);
        return message;
    }

}
