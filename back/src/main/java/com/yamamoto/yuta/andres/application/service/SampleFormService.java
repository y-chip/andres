package com.yamamoto.yuta.andres.application.service;

import com.yamamoto.yuta.andres.presentation.resource.SampleForm;
import org.springframework.stereotype.Service;

@Service
public class SampleFormService {

    public SampleForm get() {
        return new SampleForm(0, "name");
    }
}
