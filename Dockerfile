FROM gradle:8.6-jdk17

WORKDIR /app

COPY . /app

EXPOSE 8080

CMD ["sh", "-c", "gradle", "bootRun"]
