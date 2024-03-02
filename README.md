# Kotlin Docker Hot Reload

## commands
Create gradle cache volume
```shell
docker volume create gradlecache
```

Build docker image
```shell
docker compose build --no-cache
```

Run using docker compose
```shell
docker compose up -d
```

Simulate a change in the controller file and check the response.

The background classes task will pickup the file change

Spring boot live reload should restart once the kotlin class is compiles

```shell
curl 'http://localhost:8080/greeting?name=Kotlin'
sed -i 's/${name} !!!/${name} !/g' ./src/main/kotlin/com/bdd/kotlindockerhotreload/controller/GreetingsController.kt
sleep 5; curl 'http://localhost:8080/greeting?name=Kotlin'
sed -i 's/${name} !/${name} !!!/g' ./src/main/kotlin/com/bdd/kotlindockerhotreload/controller/GreetingsController.kt
sleep 5; curl 'http://localhost:8080/greeting?name=Kotlin'
```
This should give the following output
```
Hello, Kotlin !!!Hello, Kotlin !Hello, Kotlin !!!
```

## TODO
