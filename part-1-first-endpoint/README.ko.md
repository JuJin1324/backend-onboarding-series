# Part 1: 첫 번째 엔드포인트

이 문서는 튜토리얼 1부에 해당하는 코드를 실행하는 방법을 안내합니다.

## 실행 방법

### 방법 1: 인텔리제이(IntelliJ)로 실행하기

1.  **애플리케이션 실행:**
    -   `part-1-first-endpoint` > `src` > `main` > `java` > `com.businessfirst.backend` 경로로 이동하여 `Part1FirstEndpointApplication.java` 파일을 찾습니다.
    -   `main` 메소드 옆에 있는 녹색 'Run' 아이콘을 클릭하여 애플리케이션을 실행합니다.

2.  **결과 확인:**
    -   애플리케이션이 실행되면, 웹 브라우저에서 `http://localhost:8080/posts` 로 접속하여 JSON 결과가 잘 나오는지 확인합니다.

### 방법 2: 터미널(명령줄)로 실행하기

1.  **애플리케이션 실행:**
    ```bash
    ./gradlew :part-1-first-endpoint:bootRun
    ```

2.  **결과 확인:**
    웹 브라우저나 `curl`을 사용하여 `http://localhost:8080/posts` 로 접속합니다.
    ```bash
    curl http://localhost:8080/posts
    ```