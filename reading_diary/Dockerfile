FROM openjdk:8-jdk-alpine
LABEL maintainer="Zsolt Molnar <hulfyback@gmail.com>"
ADD build/libs/reading_diary-1.0.jar reading_diary.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "reading_diary.jar"]
