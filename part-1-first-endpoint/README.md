# Part 1: First Endpoint

This document provides instructions on how to run the code for Part 1 of the tutorial.

## How to Run

### Method 1: Run with IntelliJ
1.  **Run the Application:**
    -   Navigate to `part-1-first-endpoint` > `src` > `main` > `java` > `com.businessfirst.backend` and find the `Part1FirstEndpointApplication.java` file.
    -   Click the green 'Run' icon next to the `main` method to execute the application.

2.  **Verify Results:**
    -   Once the application is running, access `http://localhost:8080/posts` in your web browser to confirm that the JSON result is displayed correctly.

### Method 2: Run with Terminal
1.  **Run the Application:**
    ```bash
    ./gradlew :part-1-first-endpoint:bootRun
    ```

2.  **Verify Results:**
    Access `http://localhost:8080/posts` using a web browser or `curl`.
    ```bash
    curl http://localhost:8080/posts
    ```