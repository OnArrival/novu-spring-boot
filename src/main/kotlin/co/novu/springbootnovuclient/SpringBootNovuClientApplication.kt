package co.novu.springbootnovuclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class SpringBootNovuClientApplication

fun main(args: Array<String>) {
	runApplication<SpringBootNovuClientApplication>(*args)
}
