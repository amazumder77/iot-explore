package com.oath.hackday.iotexplore.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class HackathonSubscriber {
    public static void main(String[] args) throws MqttException, InterruptedException {

        System.out.println("== START SUBSCRIBER ==");

        MqttClient client=new MqttClient("tcp://localhost:1883", MqttClient.generateClientId());
        client.setCallback( new HackathonMqttCallback() );
        client.connect();

        client.subscribe("iot_data");
        Thread.sleep(3000);

        String messageString = "Try";
        MqttMessage message = new MqttMessage();
        message.setPayload(messageString.getBytes());
        client.publish("iot_data1", message);

        System.out.println("\tMessage '"+ messageString +"' to 'iot_data1'");

    }
}
