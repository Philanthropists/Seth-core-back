package co.edu.escuelaing.sistemas.spm.controllers;

import co.edu.escuelaing.sistemas.spm.entities.Tag;
import co.edu.escuelaing.sistemas.spm.services.TagService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "tags")
public class TagController {

  @Autowired private TagService tagService;

  @GetMapping("/tag/availability")
  public List<Tag> retrieveByAvailability(@RequestParam Boolean availability) {
    return tagService.retrieveTagsByAvailabilityParam(availability);
  }

  @PostMapping("/tag")
  public Tag addTag(@RequestBody @Valid Tag tag) {
    return tagService.save(tag);
  }

  @DeleteMapping("/tag/{id}")
  public void deleteTagById(@PathVariable String id) {
    tagService.deleteTag(id);
  }
}
