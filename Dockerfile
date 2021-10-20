FROM openjdk:8-jdk-alpine
MAINTAINER developerahmed.web.app
copy target/quiz-mgmt-app-0.0.1-SNAPSHOT.war quiz-mgmt-app-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/quiz-mgmt-app-0.0.1-SNAPSHOT.war" ]