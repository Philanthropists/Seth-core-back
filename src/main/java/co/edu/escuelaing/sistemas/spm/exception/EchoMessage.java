package co.edu.escuelaing.sistemas.spm.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EchoMessage {

  private long id;
  private String message;
  private String code;
}
