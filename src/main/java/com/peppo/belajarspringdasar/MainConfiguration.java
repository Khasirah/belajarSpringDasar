package com.peppo.belajarspringdasar;

import com.peppo.belajarspringdasar.configuration.BarConfiguration;
import com.peppo.belajarspringdasar.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
