package com.local.kafka.service;

import com.local.kafka.constants.KafkaConstants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class Producer {


   private final KafkaTemplate<String, String> kafkaTemplate;

   public void sendMessage(String message) {
      log.info(String.format("#### -> Producing message -> %s", message));
      this.kafkaTemplate.send(KafkaConstants.KAFKA_TOPIC, message);
   }

}
