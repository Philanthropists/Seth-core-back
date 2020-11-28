package co.edu.escuelaing.sistemas.spm.repository.mongo;

import java.util.UUID;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CustomEntityRepository<T extends UUIDEnabled> extends MongoRepository<T, UUID> {}
