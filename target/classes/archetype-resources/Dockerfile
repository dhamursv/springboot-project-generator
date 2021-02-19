FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/servicename-version.jar servicename.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/servicename.jar"]