package com.yamamoto.yuta.andres.presentation.resource;

import com.yamamoto.yuta.andres.infrastructure.repository.entity.Master;
import io.swagger.v3.oas.annotations.media.Schema;

public class MasterForm {

  @Schema(required = true, nullable = true)
  private final Integer code;

  @Schema(required = true, nullable = true)
  private final String name;

  public MasterForm(Integer code, String name) {
    this.code = code;
    this.name = name;
  }

  public Integer getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public MasterForm(Master master) {
    this.code = master.getCode();
    this.name = master.getName();
  }
}
