package com.huawei.producttools;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com/huawei/producttools/mapper")
@SpringBootApplication
public class ProducttoolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducttoolsApplication.class, args);
    }

}
