FROM openjdk:21
EXPOSE 8082
ADD target//jenkin-cicd.jar jenkin-cicd.jar
ENTRYPOINT ["JAVA","jar","/jenkin-cicd.jar"]