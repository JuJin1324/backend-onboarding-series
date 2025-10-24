# Part 2: API Specification with OpenAPI

This document provides instructions on how to run the code for Part 2 of the tutorial.

## How to Run

### Method 1: Run with IntelliJ

1.  **Run the Application:**
    -   Navigate to `part-2-openapi-spec` > `src` > `main` > `java` > `com.onboarding.backend` and find the `Part2OpenApiSpecApplication.java` file.
    -   Click the green 'Run' icon next to the `main` method to execute the application.

2.  **Verify Results:**
    -   Once the application is running, access `http://localhost:8080/swagger-ui.html` in your web browser to see the OpenAPI (Swagger) UI.
    -   You can test the `/posts` and `/posts/{postId}` endpoints directly from the UI.

### Method 2: Run with Terminal

1.  **Run the Application:**
    ```bash
    ./gradlew :part-2-openapi-spec:bootRun
    ```

2.  **Verify Results:**
    Access `http://localhost:8080/swagger-ui.html` in your web browser.