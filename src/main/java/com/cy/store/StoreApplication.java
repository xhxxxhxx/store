package com.cy.store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cy.store.mapper")
//@MapperScan指定当前项目重的Mapper接口路径的位置，在项目启动的时候会自动加载所有的接口
public class StoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }

}
