package com.businessfirst.backend;

/**
 * DTO (Data Transfer Object) for transferring API response data for post retrieval.
 * Defined concisely as an immutable object using a record.
 */
public record PostResponse(Long id, String title, String author) {
}
