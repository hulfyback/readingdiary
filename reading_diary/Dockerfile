FROM openjdk
LABEL maintainer="Zsolt Molnar <hulfyback@gmail.com>"
ADD rading_diary/gradle/wrapper/gradle-wrapper.jar reading_diary.jar
ENTRYPOINT ["java", "-jar", "/reading_diary.jar"]
EXPOSE 8081