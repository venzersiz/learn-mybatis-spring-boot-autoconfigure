package learn.app.config.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "learn.shared.*.domain.repository")
// Ant 패턴 사용 가능. 콤마, 세미콜론으로 여러 개 설정 가능 // TODO: 해볼 것
public class MyBatisConfig {

}
