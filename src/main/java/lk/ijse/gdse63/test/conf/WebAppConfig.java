package lk.ijse.gdse63.test.conf;

import lk.ijse.gdse63.test.dto.CustomerDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.gdse63.test")
public class WebAppConfig {
    @Bean
    public CustomerDTO getCustomer() {
        return new CustomerDTO();
    }
}
