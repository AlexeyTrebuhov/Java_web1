FROM bellsoft/liberica-openjdk-alpine:latest as BuildProject
WORKDIR /app
COPY ./java ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out ./src/ru/geekbrains/lesson1/sample/Main.java

FROM scratch as OutputFiles
COPY --from=BuildProject /app/out /bin