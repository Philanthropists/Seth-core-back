package co.edu.escuelaing.sistemas.spm.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SethCoreException extends RuntimeException {
  private HttpStatus type;
  private String message;
  private Throwable cause;
  private String countryCode;
  private String code;

  public static class SethCoreExceptionBuilder {
    public void throwIt() throws SethCoreException {
      throw this.build();
    }

    public SethCoreExceptionBuilder badRequest() {
      this.type = HttpStatus.BAD_REQUEST;
      return this;
    }

    public SethCoreExceptionBuilder internalServerError() {
      this.type = HttpStatus.INTERNAL_SERVER_ERROR;
      return this;
    }

    public SethCoreExceptionBuilder message(String format, Object... args) {
      this.message = String.format(format, args);
      return this;
    }
  }
}
