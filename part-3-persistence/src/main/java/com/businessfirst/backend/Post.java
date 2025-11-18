package com.businessfirst.backend;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.Instant;

/**
 * Entity class defining 'Post' as a business asset.
 * This class is mapped to the 'posts' table in the database.
 */
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Lob // Large Object, used for storing long text
    private String content;

    @CreationTimestamp
    private Instant createdAt;

    // JPA requires a default constructor for entity creation.
    // Set access modifier to protected to prevent unnecessary external instantiation.
    protected Post() {}

    // Constructor for business logic needs
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getter methods
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
