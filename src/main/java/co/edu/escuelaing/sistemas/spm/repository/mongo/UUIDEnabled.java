package co.edu.escuelaing.sistemas.spm.repository.mongo;

import java.util.UUID;

public interface UUIDEnabled {

  void setId(UUID id);

  boolean isNew();
}
