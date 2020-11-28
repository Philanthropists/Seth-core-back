package co.edu.escuelaing.sistemas.spm.repository;

import co.edu.escuelaing.sistemas.spm.entities.Tag;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends MongoRepository<Tag, String> {

  List<Tag> findByAvailable(Boolean availability);
}
