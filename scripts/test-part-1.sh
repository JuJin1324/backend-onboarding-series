#!/bin/bash

# 1. Run the project in the background
echo "Starting the Spring Boot application in the background..."
./gradlew :part-1-first-endpoint:bootRun &
PID=$!
echo "Application started with PID: $PID"

# Give the application some time to start
echo "Waiting for the application to start..."
sleep 10 # Wait for 10 seconds

# 2. Test the endpoint
echo "Testing the endpoint..."
curl http://localhost:8080/posts

# Add a newline for better formatting
echo

# 3. Stop the project
echo "Stopping the application..."
kill $PID
echo "Application stopped."
