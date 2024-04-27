package com.peppo.belajarspringdasar;

import com.peppo.belajarspringdasar.client.PaymentGatewayClient;
import com.peppo.belajarspringdasar.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
