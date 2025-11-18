package com.businessfirst.backend;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    /**
     * Creates a new post and saves it to the database.
     * @param postRequest DTO containing data for creating the post
     * @return The ID of the newly created Post entity
     */
    @Transactional
    public Long createPost(PostRequest postRequest) {
        Post newPost = new Post(postRequest.title(), postRequest.content());
        postRepository.save(newPost);
        return newPost.getId();
    }

    /**
     * Retrieves all posts and converts them into a list of PostResponse DTOs.
     * @return A list of PostResponse DTOs
     */
    @Transactional(readOnly = true)
    public List<PostResponse> findAll() {
        return postRepository.findAll().stream()
                .map(post -> new PostResponse(post.getId(), post.getTitle(), "user")) // 'author' is a placeholder
                .collect(Collectors.toList());
    }
}
