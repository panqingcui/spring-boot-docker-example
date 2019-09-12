# 基础依赖 jdk 8
FROM openjdk:8-jdk-alpine
#maintainer
MAINTAINER panqingcui@163.com
#指令是声明运行时容器提供服务端口， 8080
EXPOSE 8080
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.example.demo.DemoApplication"]
