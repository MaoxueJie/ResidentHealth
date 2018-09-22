package com.breeze.health.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

@Configuration
public class DataSourceConfig {
	@Bean
    @Primary
    public TransactionTemplate transactionTemplate(DataSourceTransactionManager dataSourceTransactionManager){
        return new TransactionTemplate(dataSourceTransactionManager);
    }
}
