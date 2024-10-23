package learn.app.config.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"learn.shared.*.domain.repository", "learn.app.*.domain.repository"})
public class MyBatisConfig {

}
