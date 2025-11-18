# Part 3: Data Persistence

This document guides you on how to run the code for Part 3 of the tutorial and test 'persistence'. This project uses the H2 database in file mode to verify that data is retained even after the application restarts.

## How to Run

### Method 1: Run with IntelliJ

1.  **Run the Application:**
    -   Navigate to `part-3-persistence` > `src` > `main` > `java` > `com.businessfirst.backend` and find the `Part3PersistenceApplication.java` file.
    -   Click the green 'Run' icon next to the `main` method to execute the application.

2.  **Test Persistence:**
    -   **Create a Post:** Open a new terminal and call the `POST /posts` API to register one or two new posts.
        ```bash
        curl -X POST "http://localhost:8080/posts" \
        -H "Content-Type: application/json" \
        -d "{\"title\":\"Persistence Test Post\", \"content\":\"This content will not disappear\"}"
        ```
    -   **Retrieve Posts:** Verify that the data was created correctly with the `GET /posts` API.
        ```bash
        curl -X GET "http://localhost:8080/posts"
        ```
    -   **[Key Step] Restart Application:** Stop the application in IntelliJ and then run it again.
    -   **Verify Results:** If the previously registered data is still present when you call `GET /posts` again, the test is successful.
        ```bash
        curl -X GET "http://localhost:8080/posts"
        ```

### Method 2: Run with Terminal

1.  **Run the Application:**
    ```bash
    ./gradlew :part-3-persistence:bootRun
    ```

2.  **Verify Results:**
    -   Open a new terminal and follow the same 'Test Persistence' steps from 'Method 1'.
