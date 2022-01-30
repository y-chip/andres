package com.yamamoto.yuta.andres.presentation.handler;

import com.yamamoto.yuta.andres.application.exception.ValidationException;
import com.yamamoto.yuta.andres.presentation.resource.ValidationError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ValidationExceptionHandler {

  @ExceptionHandler(ValidationException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  public ValidationError handle(ValidationException e) {
    return new ValidationError(e);
  }
}
