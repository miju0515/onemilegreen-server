package orgmeanapi.config.jpa;




import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "orgmeandb")
@EnableJpaRepositories(basePackages = "orgmeandb")
public class JpaConfig {
}


