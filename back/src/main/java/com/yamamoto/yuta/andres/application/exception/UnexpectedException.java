package com.yamamoto.yuta.andres.application.exception;

public class UnexpectedException extends RuntimeException {

  public UnexpectedException() {
    super();
  }

  public UnexpectedException(String message) {
    super(message);
  }

  public UnexpectedException(String message, Throwable cause) {
    super(message, cause);
  }
}
