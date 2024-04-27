package com.peppo.belajarspringdasar;

import com.peppo.belajarspringdasar.listener.LoginAgainSuccessListener;
import com.peppo.belajarspringdasar.listener.LoginSuccessListener;
import com.peppo.belajarspringdasar.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class
    })
    public static class TestConfiguration {}
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        Assertions.assertEquals(true, userService.login("popi", "rahasia"));
        Assertions.assertEquals(false, userService.login("popi", "salah"));
        Assertions.assertEquals(false, userService.login("haris", "rahasia"));
    }
}
