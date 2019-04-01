package indi.fleming.pocky.controller.main.recommend;

import indi.fleming.pocky.domain.Message;
import indi.fleming.pocky.domain.Recommend;
import indi.fleming.pocky.service.main.recommend.MainRecommendSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
