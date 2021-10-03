package harrisin2037;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
// @EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class MongoApplication extends SpringBootServletInitializer {
  public static void main(String[] args) {
    SpringApplication.run(MongoApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(MongoApplication.class);

  }
}
