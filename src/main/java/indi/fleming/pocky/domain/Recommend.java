package indi.fleming.pocky.domain;

import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class Recommend {

    private String recommend_id;
    private String group_code;
    private String recommend_info;
    private BigInteger recommend_time;

    public String getRecommend_id() {
        return recommend_id;
    }

    public void setRecommend_id(String recommend_id) {
        this.recommend_id = recommend_id;
    }

    public String getGroup_code() {
        return group_code;
    }

    public void setGroup_code(String group_code) {
        this.group_code = group_code;
    }

    public String getRecommend_info() {
        return recommend_info;
    }

    public void setRecommend_info(String recommend_info) {
        this.recommend_info = recommend_info;
    }

    public BigInteger getRecommend_time() {
        return recommend_time;
    }

    public void setRecommend_time(BigInteger recommend_time) {
        this.recommend_time = recommend_time;
    }
}
