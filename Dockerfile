#
# Build stage
#
FROM maven:3.8.3-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
EXPOSE 8080
ADD target/springbootjenkinsint.jar springbootjenkinsint.jar
ENTRYPOINT ["java","-jar","/springbootjenkinsint.jar"]