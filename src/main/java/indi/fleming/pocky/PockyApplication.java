package indi.fleming.pocky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("indi.fleming.pocky.mapper")
@SpringBootApplication
@ServletComponentScan
public class PockyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PockyApplication.class, args);
    }

}
