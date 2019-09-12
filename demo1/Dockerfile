# 基础依赖 jdk 8
FROM openjdk:8-jdk-alpine
#maintainer
MAINTAINER panqingcui@163.com
#指令是声明运行时容器提供服务端口， 8080
EXPOSE 8080
#复制
ADD ./target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar
#执行命令
CMD java -jar /app/demo-0.0.1-SNAPSHOT.jar
