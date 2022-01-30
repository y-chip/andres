package com.yamamoto.yuta.andres.application.exception;

public class ValidationException extends RuntimeException {

  private final String fieldName;

  public ValidationException(String fieldName, String message) {
    super(message);
    this.fieldName = fieldName;
  }

  public String getFieldName() {
    return fieldName;
  }
}
