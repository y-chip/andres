package com.yamamoto.yuta.andres.infrastructure.repository;

import com.yamamoto.yuta.andres.infrastructure.repository.entity.Master;
import com.yamamoto.yuta.andres.infrastructure.repository.entity.MasterExample;
import com.yamamoto.yuta.andres.infrastructure.repository.mapper.MasterMapper;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MasterRepository {

  private final MasterMapper masterMapper;

  public MasterRepository(MasterMapper masterMapper) {
    this.masterMapper = masterMapper;
  }

  public List<Master> select() {
    return masterMapper.selectByExample(new MasterExample());
  }
}
