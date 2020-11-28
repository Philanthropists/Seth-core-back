package co.edu.escuelaing.sistemas.spm.entities;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "seth_core_tag")
public class Tag {

  @Id private String name;

  @NotNull private LocalDateTime updatedDate;

  @NotNull private Boolean available;
}
