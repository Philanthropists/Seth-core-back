package co.edu.escuelaing.sistemas.spm.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class SethCoreExceptionHandler extends ResponseEntityExceptionHandler {

  private static final Logger LOGGER = LoggerFactory.getLogger(SethCoreExceptionHandler.class);

  @ExceptionHandler(SethCoreException.class)
  protected ResponseEntity<Object> handlePartnersException(SethCoreException ex) {
    LOGGER.error("handlePartnersException error: ", ex);
    return buildException(ex);
  }

  private ResponseEntity<Object> buildException(SethCoreException pe) {
    HttpStatus type = getHttpStatus(pe);
    return ResponseEntity.status(type)
        .body(
            EchoMessage.builder()
                .id(type.value())
                .code(pe.getCode())
                .message(pe.getMessage())
                .build());
  }

  private HttpStatus getHttpStatus(SethCoreException pe) {
    return pe.getType() != null ? pe.getType() : HttpStatus.INTERNAL_SERVER_ERROR;
  }
}
