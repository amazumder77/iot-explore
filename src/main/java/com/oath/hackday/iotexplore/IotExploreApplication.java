package com.oath.hackday.iotexplore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IotExploreApplication {


	public static void main(String[] args) {
		SpringApplication.run(IotExploreApplication.class, args);
		System.out.println ("Starting IOT application on a hack day");
	}

}
