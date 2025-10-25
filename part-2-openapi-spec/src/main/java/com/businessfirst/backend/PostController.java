package com.businessfirst.backend;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Posts", description = "APIs related to posts")
@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @Operation(summary = "Get post list", description = "Retrieves the entire list of posts.")
    @GetMapping("/posts")
    public List<PostResponse> getPosts() {
        return List.of(
                new PostResponse(1L, "title1", "content1", "John Doe", "2025-10-24"),
                new PostResponse(2L, "title2", "content2", "Jane Smith", "2025-10-25")
        );
    }

    @Operation(summary = "Get single post", description = "Retrieves detailed information for a specific post by its ID.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Successfully retrieved"),
            @ApiResponse(responseCode = "404", description = "Post not found", content = @Content)
    })
    @GetMapping("/posts/{postId}")
    public PostResponse getPost(
            @Parameter(description = "Post ID to retrieve", required = true, example = "1")
            @PathVariable Long postId
    ) {
        return postService.getPostById(postId);
    }
}
