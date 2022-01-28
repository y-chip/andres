package com.yamamoto.yuta.andres.infrastructure.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class SampleRepositoryTest {

  @Autowired private SampleRepository sampleRepository;

  private static ObjectMapper objectMapper;

  @BeforeAll
  static void setUp() {
    objectMapper = new ObjectMapper();
    objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    objectMapper.setDateFormat(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"));
  }

  @Test
  void selectByPrimaryKey() throws JsonProcessingException {
    println(sampleRepository.selectByPrimaryKey(1).get());
  }

  private void println(Object o) throws JsonProcessingException {
    System.out.println(objectMapper.writeValueAsString(o));
  }
}
