package com.peppo.belajarspringdasar;

import com.peppo.belajarspringdasar.data.Connection;
import com.peppo.belajarspringdasar.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    // @Bean(initMethod = "start", destroyMethod = "stop") -> dikomen karena sudah ada @PostConstruct dan @PreDestroy
    @Bean
    public Server server() {
        return new Server();
    }
}
