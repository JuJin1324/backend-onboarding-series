package com.onboarding.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PostController {

    @GetMapping("/posts")
    public List<PostResponse> getPosts() {
        // 데이터베이스 없이 가짜(mock) 데이터 반환
        return List.of(
            new PostResponse(1L, "첫 번째 글입니다.", "user1"),
            new PostResponse(2L, "두 번째 글입니다.", "user2")
        );
    }
}
