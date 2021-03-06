package com.yamamoto.yuta.andres.presentation.controller;

import com.yamamoto.yuta.andres.application.service.SampleFormService;
import com.yamamoto.yuta.andres.presentation.resource.SampleForm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample-form")
public class SampleFormController {

  private final SampleFormService sampleFormService;

  public SampleFormController(SampleFormService sampleFormService) {
    this.sampleFormService = sampleFormService;
  }

  @GetMapping("/{id}")
  public SampleForm get(@PathVariable("id") Integer id) {
    return sampleFormService.get(id);
  }

  @PutMapping("/{id}")
  public void put(@PathVariable("id") Integer id, @RequestBody SampleForm sampleForm) {
    sampleFormService.post(id, sampleForm);
  }
}
