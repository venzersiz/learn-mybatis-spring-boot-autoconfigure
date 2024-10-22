package learn.dao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class OneMapperTest {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    OneMapper oneMapper;

    @Test
    void printSpringBeans() {
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        /**
         * dataSource
         * sqlSessionFactory
         * sqlSessionTemplate
         * oneMapper
         */
    }

    @Test
    void find1() {
        assertThat(oneMapper.find1()).isEqualTo(1);
    }
}
