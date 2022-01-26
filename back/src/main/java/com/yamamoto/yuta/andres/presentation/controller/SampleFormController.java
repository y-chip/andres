package com.yamamoto.yuta.andres.presentation.controller;

import com.yamamoto.yuta.andres.application.service.SampleFormService;
import com.yamamoto.yuta.andres.presentation.resource.SampleForm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample-form")
public class SampleFormController {

    private final SampleFormService sampleFormService;

    public SampleFormController(SampleFormService sampleFormService) {
        this.sampleFormService = sampleFormService;
    }

    @GetMapping
    public SampleForm get() {
        return sampleFormService.get();
    }
}
