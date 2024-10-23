package learn.shared.user.domain.repository;

import learn.app.Application;
import learn.app.user.domain.repository.AppUserMapper;
import learn.shared.user.domain.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = Application.class)
class AppUserMapperTest {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    AppUserMapper appUserMapper;

    @Test
    void printSpringBeans() {
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        /**
         * dataSource
         * sqlSessionFactory
         * sqlSessionTemplate
         * appUserMapper
         */
    }

    @Test
    void findById() {
        User user = appUserMapper.findById(1);
        System.out.println(user);
    }
}
