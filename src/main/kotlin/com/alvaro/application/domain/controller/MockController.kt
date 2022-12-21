package com.alvaro.application.domain.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MockController {

    @GetMapping("/mock")
    fun getMock(): String {
        println("Accessing getMock endpoint")
        return "mock"
    }

}