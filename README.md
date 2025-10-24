[한국어 문서 보기 (View in Korean)](README.ko.md)

This repository manages the source code for the "Backend Onboarding" tutorial series. This guide will help you run the code for each part of the series on your computer.

## Project Structure

This project consists of the following main directories:

```
backend-onboarding-series/
├── part-1-first-endpoint/ # Code for the first tutorial part
└── scripts/             # Scripts for project execution and testing
```

## How to Run the Code (Chapter 1 Example)

Choose the method that is most convenient for you.

### Method 1: Run with IntelliJ (Recommended for beginners)

1.  **Import Project in IntelliJ:**
    -   On the IntelliJ welcome screen, click `Get from VCS` or `Clone Repository`.
    -   Paste the repository URL (`https://github.com/jujin1324/backend-onboarding-series.git`) into the `URL` field and click `Clone`.

2.  **Switch to the Correct Version (Tag):**
    -   Once the project is open, find and click the current Git branch name (`main` or `master`) in the **bottom right** of the IntelliJ window.
    -   In the pop-up menu, find the `Tags` group and select the desired tag (e.g., `v1.0.1-post-01`).
    -   Click `Checkout` from the sub-menu of the selected tag. The code has now been switched to Chapter 1.

3.  **Run the Application:**
    -   Navigate to `part-1-first-endpoint` > `src` > `main` > `java` > `com.onboarding.backend` and find the `Application.java` file.
    -   Click the green 'Run' icon next to the `main` method to execute the application.

4.  **Verify Results:**
    -   Once the application is running, access `http://localhost:8080/posts` in your web browser to confirm that the JSON result is displayed correctly.

### Method 2: Run with Terminal (Command Line)

1.  **Clone the Repository:**
    ```bash
    git clone https://github.com/jujin1324/backend-onboarding-series.git
    cd backend-onboarding-series
    ```

2.  **Get Chapter 1 Code:**
    ```bash
    git checkout v1.0.1-post-01
    ```

3.  **Run the Application:**
    ```bash
    ./gradlew :part-1-first-endpoint:bootRun
    ```

4.  **Verify Results:**
    Access `http://localhost:8080/posts` using a web browser or `curl`.
    ```bash
    curl http://localhost:8080/posts
    ```

## Tutorial Series and Tags

You can check the code for other parts by checking out the corresponding Git tags.

| Part | Title | Tag | Execution Module |
| :--- | :---- | :-- | :--- |
| 1 | First Endpoint | `v1.0.1-post-01` | `part-1-first-endpoint` |
| 1 | First Endpoint (Comments Translated) | `v1.0.2-post-01` | `part-1-first-endpoint` |
| 2 | (Upcoming) | | |

## Prerequisites

- Java 17
- Gradle 8.9
