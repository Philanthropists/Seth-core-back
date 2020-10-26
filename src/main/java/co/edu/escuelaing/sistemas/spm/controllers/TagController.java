package co.edu.escuelaing.sistemas.spm.controllers;

import co.edu.escuelaing.sistemas.spm.entities.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "tags")
public class TagController {

    @PostMapping("/tag")
    public ResponseEntity<?> addTag(@RequestBody Tag tag){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
