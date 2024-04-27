package com.peppo.belajarspringdasar.processor;

import com.peppo.belajarspringdasar.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("prefix id generator processor for bean {}", beanName);
        if (bean instanceof IdAware) {
            log.info("prefix set id generator processor for bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("PREFIX-" + idAware.getId());
        }

        return bean;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
