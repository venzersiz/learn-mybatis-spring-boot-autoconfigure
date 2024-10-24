package learn.shared;

import static org.assertj.core.api.Assertions.assertThat;

import com.zaxxer.hikari.HikariDataSource;
import learn.app.AppApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = AppApplication.class)
class DataSourceTest {

    @Autowired
    HikariDataSource dataSourceForUser;

    @Autowired
    HikariDataSource dataSourceForOrder;

    @Test
    void multiDataSources() {
        assertThat(dataSourceForUser.getJdbcUrl()).isEqualTo("jdbc:h2:mem:user-db");
        
        assertThat(dataSourceForOrder.getJdbcUrl()).isEqualTo("jdbc:h2:mem:order-db");
    }
}
