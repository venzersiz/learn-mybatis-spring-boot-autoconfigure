package learn.shared.config.db;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class SharedDbConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari.user")
    public DataSource dataSourceForUser() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari.order")
    public DataSource dataSourceForOrder() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public DataSourceTransactionManager transactionManagerForUser(DataSource dataSourceForUser) { // 같은 클래스 내에 빈이 있기 때문에 @Qualifier 불필요

        return new DataSourceTransactionManager(dataSourceForUser);
    }

    @Bean
    public DataSourceTransactionManager transactionManagerForOrder(DataSource dataSourceForOrder) {

        return new DataSourceTransactionManager(dataSourceForOrder);
    }
}
