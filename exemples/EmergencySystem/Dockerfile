FROM openjdk:17-oracle
USER root
EXPOSE 8181
ADD target/emergencysystem.jar emergencysystem.jar
ENTRYPOINT ["java", "-jar","/emergencysystem.jar"]