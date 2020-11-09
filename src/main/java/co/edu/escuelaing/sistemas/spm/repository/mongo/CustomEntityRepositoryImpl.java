package co.edu.escuelaing.sistemas.spm.repository.mongo;

import java.util.List;
import java.util.UUID;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

public class CustomEntityRepositoryImpl<T extends UUIDEnabled>
    extends SimpleMongoRepository<T, UUID> implements CustomEntityRepository<T> {
  CustomEntityRepositoryImpl(
      MongoEntityInformation<T, UUID> entityInformation, MongoOperations mongoOperations) {
    super(entityInformation, mongoOperations);
  }

  @Override
  public <S extends T> S insert(S entity) {
    generateId(entity);
    return super.insert(entity);
  }

  @Override
  public <S extends T> List<S> insert(Iterable<S> entities) {
    for (S entity : entities) {
      generateId(entity);
    }
    return super.insert(entities);
  }

  @Override
  public <S extends T> S save(S entity) {
    generateId(entity);
    return super.save(entity);
  }

  @Override
  public <S extends T> List<S> saveAll(Iterable<S> entities) {
    for (S entity : entities) {
      generateId(entity);
    }
    return super.saveAll(entities);
  }

  protected <S extends T> S generateId(S entity) {
    if (!entity.isNew()) {
      return entity;
    }
    UUID id = UUID.randomUUID();
    entity.setId(id);
    return entity;
  }
}
