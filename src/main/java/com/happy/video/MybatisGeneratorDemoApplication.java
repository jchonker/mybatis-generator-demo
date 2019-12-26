package com.happy.video;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.happy.video.mapper")   //可以配置扫描mapper接口,不过在mapper中已经手动添加了注解
public class MybatisGeneratorDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisGeneratorDemoApplication.class, args);
    }

}
