package com.yamamoto.yuta.andres;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

  private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

  @Pointcut("execution(* com.yamamoto.yuta.andres..*.*(..))")
  private void pointcut() {}

  @Before("pointcut()")
  public void doBefore(JoinPoint jp) {

    Signature sig = jp.getSignature();

    if (jp.getArgs() == null || jp.getArgs().length == 0) {

      logger.info(
          String.format("Execute method '%s.%s'", sig.getDeclaringTypeName(), sig.getName()));
      return;
    }

    logger.info(
        String.format(
            "Execute method '%s.%s' (args: %s)",
            sig.getDeclaringTypeName(), sig.getName(), Arrays.toString(jp.getArgs())));
  }

  @AfterReturning(pointcut = "pointcut()", returning = "value")
  public void doAfterReturning(JoinPoint jp, Object value) {

    Signature sig = jp.getSignature();

    logger.info(
        String.format(
            "Return from method '%s.%s' (value: %s)",
            sig.getDeclaringTypeName(), sig.getName(), value));
  }

  @AfterThrowing(pointcut = "pointcut()", throwing = "exception")
  public void doAfterThrowing(JoinPoint jp, Exception exception) {

    Signature sig = jp.getSignature();

    StringWriter stackTrace = new StringWriter();
    exception.printStackTrace(new PrintWriter(stackTrace));

    logger.info(
        String.format(
            "Throw Exception from method '%s.%s' (stackTrace: %s)",
            sig.getDeclaringTypeName(), sig.getName(), stackTrace));
  }
}
