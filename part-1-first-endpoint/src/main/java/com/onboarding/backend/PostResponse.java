package com.onboarding.backend;

// record를 사용하여 불변 데이터 객체를 간결하게 정의
public record PostResponse(Long id, String title, String author) {
}
