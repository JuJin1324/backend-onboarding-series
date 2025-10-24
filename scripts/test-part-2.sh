#!/bin/bash

# 1. Run the project in the background
echo "Starting the Spring Boot application (part-2) in the background..."
./gradlew :part-2-openapi-spec:bootRun &
PID=$!
echo "Application started with PID: $PID"

# Give the application some time to start
echo "Waiting for the application to start..."
sleep 15 # Wait for 15 seconds, openapi might take a bit longer

# 2. Test the endpoints
echo "---"
echo "Testing the /posts endpoint..."
curl http://localhost:8080/posts
echo
echo "---"

echo "Testing the /posts/1 endpoint..."
curl http://localhost:8080/posts/1
echo
echo "---"

echo "Testing the /swagger-ui.html endpoint..."
STATUS_CODE=$(curl -s -o /dev/null -w "%{http_code}" http://localhost:8080/swagger-ui.html)
if [ "$STATUS_CODE" -eq 200 ]; then
    echo "Swagger UI is accessible (Status Code: 200)"
else
    echo "Failed to access Swagger UI (Status Code: $STATUS_CODE)"
fi
echo "---"


# 3. Stop the project
echo "Stopping the application..."
kill $PID
echo "Application stopped."
