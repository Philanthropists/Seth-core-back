package co.edu.escuelaing.sistemas.spm.controllers;

import co.edu.escuelaing.sistemas.spm.entities.Item;
import co.edu.escuelaing.sistemas.spm.entities.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    @PostMapping("/publish")
    public ResponseEntity<?> addPost(@RequestBody Post post){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/posts")
    public ResponseEntity<?> getPosts(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/item")
    public ResponseEntity<?> addItem(@RequestBody Item item){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/removeitem")
    public ResponseEntity<?> removeItem(@RequestBody Item item){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
