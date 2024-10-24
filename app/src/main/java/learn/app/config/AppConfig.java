package learn.app.config;

import learn.shared.config.db.SharedDbConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SharedDbConfig.class)
public class AppConfig {

}
