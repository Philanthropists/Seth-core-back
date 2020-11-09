package co.edu.escuelaing.sistemas.spm.repository;

import co.edu.escuelaing.sistemas.spm.entities.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, String> {}
