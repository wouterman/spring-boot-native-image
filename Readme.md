Project for building native images with Spring Boot based on their tutorial for Spring Native.

Requirements:
- Graalvm (used 21.0.0.2)

Build project using `mvn spring-boot:image-build`
Run image using `docker run -p 8080:8080 docker.io/library/spring-graal-native-image:0.0.1-SNAPSHOT`


