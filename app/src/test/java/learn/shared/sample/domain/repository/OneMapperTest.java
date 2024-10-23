package learn.shared.sample.domain.repository;

import static org.assertj.core.api.Assertions.assertThat;

import learn.app.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class) // 현재 패키지가 Application.java가 있는 위치와 다르기 때문에 설정함
class OneMapperTest {


    @Autowired
    OneMapper oneMapper;

    @Test
    void find1() {
        assertThat(oneMapper.find1()).isEqualTo(1);
    }
}
