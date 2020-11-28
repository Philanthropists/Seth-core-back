package co.edu.escuelaing.sistemas.spm.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
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
@Document(collection = "seth_core_post")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {

  @Id private UUID id;

  @NotNull private PostType postType;

  @NotNull @NotBlank private String name;

  @NotNull @NotBlank private String description;

  private LocalDateTime createdDate;

  private LocalDateTime updatedDate;

  private LocalDateTime resolvedDate;

  @NotNull private Long points;

  @NotNull @NotEmpty private List<Item> items;
}
