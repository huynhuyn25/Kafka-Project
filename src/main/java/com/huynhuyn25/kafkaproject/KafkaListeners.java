package com.huynhuyn25.kafkaproject;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "HuynHuyn2",groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: "+data);

    }

//    topicPartitions =
//    { @TopicPartition(topic = "HuynHuyn2", partitions = { "0" },
//            partitionOffsets = @PartitionOffset(partition = "*", initialOffset = "0"))
//    }
}
