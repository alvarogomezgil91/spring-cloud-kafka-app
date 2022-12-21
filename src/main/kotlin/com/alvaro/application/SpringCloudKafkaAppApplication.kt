package com.alvaro.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudKafkaAppApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudKafkaAppApplication>(*args)
}
