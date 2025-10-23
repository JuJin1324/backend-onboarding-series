이 저장소는 "백엔드 온보딩" 튜토리얼 시리즈를 위한 소스 코드를 관리합니다. 이 가이드는 시리즈의 각 파트 코드를 당신의 컴퓨터에서 실행하는 데 도움을 줄 것입니다。

## 프로젝트 구성

이 프로젝트는 다음과 같은 주요 디렉터리로 구성되어 있습니다.

```
backend-onboarding-series/
├── part-1-first-endpoint/ # 첫 번째 튜토리얼 파트의 코드
└── scripts/             # 프로젝트 실행 및 테스트 스크립트
```

## 코드 실행 방법 (1장 예시)

두 가지 방법 중 편한 것을 선택하여 진행하세요.

### 방법 1: 인텔리제이(IntelliJ)로 실행하기 (초보자 추천)

1.  **인텔리제이에서 프로젝트 가져오기:**
    -   인텔리제이 시작 화면에서 `Get from VCS` 버튼을 클릭합니다.
    -   `URL`에 이 저장소의 주소(`https://github.com/jujin1324/backend-onboarding-series.git`)를 붙여넣고 `Clone` 버튼을 누릅니다.

2.  **올바른 버전(태그)으로 전환하기:**
    -   프로젝트가 열리면, 인텔리제이 창의 **오른쪽 하단**에서 현재 Git 브랜치 이름(`main` 또는 `master`)을 찾아서 클릭합니다.
    -   나타나는 팝업 메뉴에서 `Tags` 그룹을 찾은 다음, 원하는 태그(예: `v1.0-post-01`)를 선택합니다.
    -   선택한 태그의 하위 메뉴에서 `Checkout`을 클릭합니다. 이제 1장에 해당하는 코드로 변경되었습니다.

3.  **애플리케이션 실행:**
    -   `part-1-first-endpoint` > `src` > `main` > `java` > `com.onboarding.backend` 경로로 이동하여 `Application.java` 파일을 찾습니다.
    -   `main` 메소드 옆에 있는 녹색 'Run' 아이콘을 클릭하여 애플리케이션을 실행합니다。

4.  **결과 확인:**
    -   애플리케이션이 실행되면, 웹 브라우저에서 `http://localhost:8080/posts` 로 접속하여 JSON 결과가 잘 나오는지 확인합니다.

### 방법 2: 터미널(명령줄)로 실행하기

1.  **저장소 복제:**
    ```bash
    https://github.com/jujin1324/backend-onboarding-series.git
    cd backend-onboarding-series
    ```

2.  **1장 코드 가져오기:**
    ```bash
    git checkout v1.0-post-01
    ```

3.  **애플리케이션 실행:**
    ```bash
    ./gradlew :part-1-first-endpoint:bootRun
    ```

4.  **결과 확인:**
    웹 브라우저나 `curl`을 사용하여 `http://localhost:8080/posts` 로 접속합니다.

## 튜토리얼 시리즈 및 태그

다른 파트의 코드는 해당 Git 태그를 `checkout`하여 확인할 수 있습니다.

| Part | 제목 | 태그 | 실행 모듈 |
| :--- | :---- | :-- | :--- |
| 1 | 첫 번째 엔드포인트 | `v1.0-post-01` | `part-1-first-endpoint` |
| 2 | (예정) | | |

## 사전 요구사항

- Java 17
- Gradle 8.9