package com.redkit.olimpo.securityservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class SecurityServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(SecurityServiceApplication::class.java, *args)
}
