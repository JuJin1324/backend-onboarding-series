# Part 3: 데이터 영속성

이 문서는 튜토리얼 3부에 해당하는 코드를 실행하고 '영속성'을 테스트하는 방법을 안내합니다. 이 프로젝트는 H2 데이터베이스를 파일 모드로 사용하여 애플리케이션을 재시작해도 데이터가 유지되는 것을 확인합니다.

## 실행 방법

### 방법 1: 인텔리제이(IntelliJ)로 실행하기

1.  **애플리케이션 실행:**
    -   `part-3-persistence` > `src` > `main` > `java` > `com.businessfirst.backend` 경로로 이동하여 `Part3PersistenceApplication.java` 파일을 찾습니다.
    -   `main` 메소드 옆에 있는 녹색 'Run' 아이콘을 클릭하여 애플리케이션을 실행합니다.

2.  **영속성 테스트:**
    -   **게시글 생성:** 새 터미널을 열고, `POST /posts` API를 호출하여 새 게시글을 1~2개 등록합니다.
        ```bash
        curl -X POST "http://localhost:8080/posts" \
        -H "Content-Type: application/json" \
        -d "{\"title\":\"영속성 테스트 글\", \"content\":\"사라지지 않는 내용\"}"
        ```
    -   **게시글 조회:** `GET /posts` API로 데이터가 잘 생성되었는지 확인합니다.
        ```bash
        curl -X GET "http://localhost:8080/posts"
        ```
    -   **[핵심] 애플리케이션 재시작:** 인텔리제이에서 애플리케이션을 중지(Stop)했다가 다시 실행(Run)합니다.
    -   **결과 확인:** 다시 `GET /posts`를 호출했을 때, 이전에 등록한 데이터가 사라지지 않고 그대로 조회되면 성공입니다.
        ```bash
        curl -X GET "http://localhost:8080/posts"
        ```

### 방법 2: 터미널(명령줄)로 실행하기

1.  **애플리케이션 실행:**
    ```bash
    ./gradlew :part-3-persistence:bootRun
    ```

2.  **결과 확인:**
    -   새 터미널을 열고 '방법 1'의 2단계 '영속성 테스트'를 동일하게 진행합니다.
