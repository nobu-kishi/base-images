# syntax=docker/dockerfile:1

FROM public.ecr.aws/docker/library/maven:3.9-amazoncorretto-21 AS build
WORKDIR /app

# ビルドキャッシュを有効にするため依存関係を先に解決
COPY pom.xml .
RUN mvn -B -ntp -q dependency:go-offline

COPY src ./src
RUN mvn -B -ntp -q -DskipTests package

FROM public.ecr.aws/docker/library/tomcat:9.0.109-jdk21-corretto-al2

RUN --mount=type=cache,target=/var/cache/yum \
    yum update -y && \
    yum install -y curl procps-ng && \
    yum clean all

COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/app.war

EXPOSE 8080

ENTRYPOINT ["catalina.sh"]
CMD ["run"]
