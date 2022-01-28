package com.yamamoto.yuta.andres;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yamamoto.yuta.andres.infrastructure.repository.mapper")
@SpringBootApplication
public class AndresApplication {

  public static void main(String[] args) {
    SpringApplication.run(AndresApplication.class, args);
  }
}
