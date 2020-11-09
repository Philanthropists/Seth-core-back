package co.edu.escuelaing.sistemas.spm.entities;

import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {

  @NotNull @NotBlank private String name;

  @NotNull @NotBlank private String description;

  @NotNull private Boolean resolved;

  @Builder.Default private Set<String> tags = new HashSet<>();
}
