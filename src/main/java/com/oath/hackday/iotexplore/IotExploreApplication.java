package com.oath.hackday.iotexplore;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IotExploreApplication {


	public static void main(String[] args) throws InterruptedException, MqttException {

		SpringApplication.run(IotExploreApplication.class, args);

		System.out.println ("Starting IOT application on a hack day");

		if (args.length < 1) {
			throw new IllegalArgumentException("Must have either 'publisher' or 'subscriber' as argument");
		}
		switch (args[0]) {
			case "publisher":
				com.oath.hackday.iotexplore.mqtt.HackathonPublisher.main(args);
				break;
			case "subscriber":
				com.oath.hackday.iotexplore.mqtt.HackathonSubscriber.main(args);
				break;
			default:
				throw new IllegalArgumentException("Don't know how to do " + args[0]);
		}

	}

}
