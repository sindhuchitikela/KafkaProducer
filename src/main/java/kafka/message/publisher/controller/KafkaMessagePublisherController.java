package kafka.message.publisher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kafka.message.publisher.service.KafkaMessagePublisherService;

@RequestMapping("kafka/message")
@RestController
public class KafkaMessagePublisherController {

  private final KafkaMessagePublisherService service;

  @Autowired
  public KafkaMessagePublisherController(KafkaMessagePublisherService service) {
    this.service = service;
  }

  @RequestMapping("publish")
  @ResponseBody
  public void publish() {
    service.publishEvent();
  }
}
