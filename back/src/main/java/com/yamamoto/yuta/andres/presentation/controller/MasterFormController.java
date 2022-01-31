package com.yamamoto.yuta.andres.presentation.controller;

import com.yamamoto.yuta.andres.application.service.MasterFormService;
import com.yamamoto.yuta.andres.presentation.resource.MasterForm;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/master-form")
public class MasterFormController {

  private final MasterFormService masterFormService;

  public MasterFormController(MasterFormService masterFormService) {
    this.masterFormService = masterFormService;
  }

  @GetMapping
  public List<MasterForm> get() {
    return masterFormService.get();
  }
}
