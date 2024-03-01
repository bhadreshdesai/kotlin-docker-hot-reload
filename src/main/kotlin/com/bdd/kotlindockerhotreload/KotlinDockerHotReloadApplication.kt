package com.bdd.kotlindockerhotreload

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinDockerHotReloadApplication

fun main(args: Array<String>) {
	runApplication<KotlinDockerHotReloadApplication>(*args)
}
