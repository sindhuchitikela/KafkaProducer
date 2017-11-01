package kafka.message.publisher.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.PropertySource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

@EnableBinding(Source.class)
@PropertySource({ "classpath:application-local.properties" })
@Service
public class KafkaMessagePublisherService {

  private static final Logger LOGGER = LoggerFactory.getLogger(KafkaMessagePublisherService.class);
  private final Source        source;

  @Autowired
  public KafkaMessagePublisherService(Source source) {
    this.source = source;
  }

  @Output(Source.OUTPUT)
  public void publishEvent() {
    source.output().send(MessageBuilder.withPayload("Test Message").build());
    LOGGER.info("Successfully published message on to kafka topic");
  }
}
