package co.edu.escuelaing.sistemas.spm.services;

import co.edu.escuelaing.sistemas.spm.entities.Tag;
import co.edu.escuelaing.sistemas.spm.repository.TagRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {

  @Autowired private TagRepository repository;

  public List<Tag> retrieveTagsByAvailabilityParam(Boolean availability) {
    return repository.findByAvailable(availability);
  }

  public Tag save(Tag tag) {
    tag.setUpdatedDate(LocalDateTime.now());
    return repository.save(tag);
  }

  public void deleteTag(String id) {
    repository.deleteById(id);
  }
}
