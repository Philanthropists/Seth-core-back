package co.edu.escuelaing.sistemas.spm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.escuelaing.sistemas.spm.entities.Post;

public interface PostRepository extends JpaRepository<Post, String> {

}
