# define base docker image
FROM openjdk:21
LABEL maintainer="Ahemad72"
ADD target/LMS-0.0.1-SNAPSHOT.jar edf-lms.jar
ENTRYPOINT ["java","-jar","edf-lms.jar"]