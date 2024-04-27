package com.peppo.belajarspringdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.peppo.belajarspringdasar.configuration" // bisa lebih dari satu
})
public class ScanConfiguration {
}
