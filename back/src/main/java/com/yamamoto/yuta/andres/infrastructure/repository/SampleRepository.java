package com.yamamoto.yuta.andres.infrastructure.repository;

import com.yamamoto.yuta.andres.infrastructure.repository.entity.Sample;
import com.yamamoto.yuta.andres.infrastructure.repository.mapper.SampleMapper;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {

  private final SampleMapper sampleMapper;

  public SampleRepository(SampleMapper sampleMapper) {
    this.sampleMapper = sampleMapper;
  }

  public Optional<Sample> selectByPrimaryKey(Integer id) {
    return Optional.ofNullable(sampleMapper.selectByPrimaryKey(id));
  }
}
