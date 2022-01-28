package com.yamamoto.yuta.andres.application.service;

import com.yamamoto.yuta.andres.application.exception.UnexpectedException;
import com.yamamoto.yuta.andres.infrastructure.repository.SampleRepository;
import com.yamamoto.yuta.andres.presentation.resource.SampleForm;
import org.springframework.stereotype.Service;

@Service
public class SampleFormService {

  private final SampleRepository sampleRepository;

  public SampleFormService(SampleRepository sampleRepository) {
    this.sampleRepository = sampleRepository;
  }

  public SampleForm get(Integer id) {
    return sampleRepository
        .selectByPrimaryKey(id)
        .map(SampleForm::new)
        .orElseThrow(() -> new UnexpectedException(String.format("Sampleが取得できませんでした。（id：%s）", id)));
  }

  public void post(Integer id, SampleForm sampleForm) {
    sampleRepository.updateByPrimaryKey(sampleForm.genSample(id));
  }
}
