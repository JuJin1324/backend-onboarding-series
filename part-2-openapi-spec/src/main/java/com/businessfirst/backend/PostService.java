package com.businessfirst.backend;

import org.springframework.stereotype.Service;

@Service
public class PostService {
    public PostResponse getPostById(Long postId) {
        // In a real application, you would fetch this from a database.
        // For this example, we'll return a dummy object.
        if (postId == 1L) {
            return new PostResponse(1L, "How to create an API spec", "Using OpenAPI(Swagger) allows you to...", "John Doe", "2025-10-25");
        }
        // In a real app, you'd throw a "Not Found" exception here.
        return null;
    }
}
