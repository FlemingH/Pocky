package indi.fleming.pocky.service.main.recommend;

import indi.fleming.pocky.domain.Recommend;

import java.util.List;

public interface MainRecommendSvc {

    List<Recommend> fetchRecommendByGroup(String group_code);

}
