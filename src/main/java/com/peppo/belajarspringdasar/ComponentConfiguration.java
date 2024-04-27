package com.peppo.belajarspringdasar;

import com.peppo.belajarspringdasar.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.peppo.belajarspringdasar.service",
        "com.peppo.belajarspringdasar.repository",
        "com.peppo.belajarspringdasar.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
