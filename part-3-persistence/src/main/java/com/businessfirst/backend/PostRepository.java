package com.businessfirst.backend;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for handling database operations for the Post entity.
 * By extending JpaRepository<Post, Long>, basic CRUD (Create, Read, Update, Delete) methods are automatically provided.
 * - Post: The entity class to manage
 * - Long: The ID type of the entity
 */
public interface PostRepository extends JpaRepository<Post, Long> {
}
