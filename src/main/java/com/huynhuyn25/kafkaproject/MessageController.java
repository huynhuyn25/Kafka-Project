package com.huynhuyn25.kafkaproject;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ObjectInputStream;
import java.util.List;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {
    private KafkaTemplate<String,String> kafkaTemplate;
    public MessageController(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate =kafkaTemplate;
    }
    @PostMapping
    public ResponseEntity<String> publish(@RequestBody MessageRequest request){
        kafkaTemplate.send("HuynHuyn2",request.key(),request.message());
        return  ResponseEntity.ok("Message sent to the topic!");
    }


}
