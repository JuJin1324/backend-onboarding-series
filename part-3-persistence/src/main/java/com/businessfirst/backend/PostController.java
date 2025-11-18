package com.businessfirst.backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;

@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    /**
     * API to retrieve all posts.
     * @return A list of posts
     */
    @GetMapping("/posts")
    public ResponseEntity<List<PostResponse>> getPosts() {
        return ResponseEntity.ok(postService.findAll());
    }

    /**
     * API to create a new post.
     * @param postRequest Information for the post to be created
     * @return 201 Created response with the URI of the newly created post
     */
    @PostMapping("/posts")
    public ResponseEntity<Void> createPost(@RequestBody PostRequest postRequest) {
        Long newPostId = postService.createPost(postRequest);
        URI location = URI.create("/posts/" + newPostId);
        return ResponseEntity.created(location).build();
    }
}
