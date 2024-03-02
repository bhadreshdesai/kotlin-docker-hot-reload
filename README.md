# Kotlin Docker Hot Reload

## commands
```shell
curl http://localhost:8080/greeting?name=Kotlin
```
Build docker image
```shell
docker compose build --no-cache
```

Run using docker compose
```shell
docker compose up -d
```

Test change
```shell
curl 'http://localhost:8080/greeting?name=Kotlin'
sed -i 's/${name} !!!/${name} !/g' ./src/main/kotlin/com/bdd/kotlindockerhotreload/controller/GreetingsController.kt
sleep 5; curl 'http://localhost:8080/greeting?name=Kotlin'
sed -i 's/${name} !/${name} !!!/g' ./src/main/kotlin/com/bdd/kotlindockerhotreload/controller/GreetingsController.kt
sleep 5; curl 'http://localhost:8080/greeting?name=Kotlin'
```

## TODO
- first run takes 115 seconds to start up
- mounting volumes gives error /app already watched