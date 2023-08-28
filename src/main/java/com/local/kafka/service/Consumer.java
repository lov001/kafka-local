package com.local.kafka.service;

import com.local.kafka.constants.KafkaConstants;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class Consumer {


   @KafkaListener(topics = KafkaConstants.KAFKA_TOPIC, groupId = "kafka-local-id")
   public void consumeMessage(String message) throws IOException {
      log.info(String.format("#### -> Consumed message -> %s", message));
   }

}
