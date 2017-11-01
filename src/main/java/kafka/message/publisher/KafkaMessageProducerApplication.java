package kafka.message.publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({ "kafka.message.publisher" })
@PropertySource({ "classpath:/application-local.properties" })

public class KafkaMessageProducerApplication {

  public static void main(String[] args) {
    SpringApplication.run(KafkaMessageProducerApplication.class, args);
  }

}
