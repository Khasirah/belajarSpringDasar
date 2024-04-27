package com.peppo.belajarspringdasar;

import com.peppo.belajarspringdasar.data.Connection;
import com.peppo.belajarspringdasar.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        // applicationContext.close(); // method close terdapat di ConfigureableApplicationContext -> turunan dari ApplicationContext
    }

    @Test
    void testConnection() {
        Connection connection = applicationContext.getBean(Connection.class);

    }

    @Test
    void testServer() {
        Server bean = applicationContext.getBean(Server.class);
    }
}
