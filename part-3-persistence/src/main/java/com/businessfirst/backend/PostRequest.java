package com.businessfirst.backend;

/**
 * DTO (Data Transfer Object) for transferring API request data to create a post.
 * Defined concisely as an immutable object using a record.
 */
public record PostRequest(String title, String content) {
}
