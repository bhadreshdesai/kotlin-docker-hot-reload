package com.bdd.kotlindockerhotreload.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingsController {
    @GetMapping("/greeting")
    fun greeting(@RequestParam name: String) = "Hello, ${name} !!!"
}