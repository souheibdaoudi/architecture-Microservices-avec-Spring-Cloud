package com.example.eurkaserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication

@EnableEurekaServer

public class EurrkaServerApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(EurrkaServerApplication.class, args);
	}

}