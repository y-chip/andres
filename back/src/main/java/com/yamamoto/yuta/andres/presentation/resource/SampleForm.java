package com.yamamoto.yuta.andres.presentation.resource;

public class SampleForm {

    private final Integer id;

    private final String name;

    public SampleForm(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
