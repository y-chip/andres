package com.yamamoto.yuta.andres.application.service;

import com.yamamoto.yuta.andres.infrastructure.repository.MasterRepository;
import com.yamamoto.yuta.andres.presentation.resource.MasterForm;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class MasterFormService {

  private final MasterRepository masterRepository;

  public MasterFormService(MasterRepository masterRepository) {
    this.masterRepository = masterRepository;
  }

  public List<MasterForm> get() {
    return masterRepository.select().stream().map(MasterForm::new).collect(Collectors.toList());
  }
}
