package com.onboarding.backend;

import io.swagger.v3.oas.annotations.media.Schema;

public class PostResponse {
    @Schema(description = "Post ID", example = "1")
    private final Long id;
    @Schema(description = "Post title", example = "How to create an API spec")
    private final String title;
    @Schema(description = "Post content", example = "Using OpenAPI(Swagger) allows you to...")
    private final String content;
    @Schema(description = "Author", example = "John Doe")
    private final String author;
    @Schema(description = "Creation date", example = "2025-10-25")
    private final String createdAt;

    public PostResponse(Long id, String title, String content, String author, String createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
