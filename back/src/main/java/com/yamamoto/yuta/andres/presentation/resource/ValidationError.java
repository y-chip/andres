package com.yamamoto.yuta.andres.presentation.resource;

import com.yamamoto.yuta.andres.application.exception.ValidationException;
import io.swagger.v3.oas.annotations.media.Schema;

public class ValidationError {

  @Schema(required = true, nullable = false)
  private final String fieldName;

  @Schema(required = true, nullable = false)
  private final String message;

  public ValidationError(String fieldName, String message) {
    this.fieldName = fieldName;
    this.message = message;
  }

  public String getFieldName() {
    return fieldName;
  }

  public String getMessage() {
    return message;
  }

  public ValidationError(ValidationException e) {
    this.fieldName = e.getFieldName();
    this.message = e.getMessage();
  }
}
