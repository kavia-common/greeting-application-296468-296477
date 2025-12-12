#!/bin/bash
cd /home/kavia/workspace/code-generation/greeting-application-296468-296477/springboot_backend
./gradlew checkstyleMain
LINT_EXIT_CODE=$?
if [ $LINT_EXIT_CODE -ne 0 ]; then
   exit 1
fi

