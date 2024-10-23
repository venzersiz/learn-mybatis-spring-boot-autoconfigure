package learn.shared.user.domain.repository;

import learn.app.Application;
import learn.shared.user.domain.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = Application.class)
public class UserMapperTest {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    UserMapper userMapper;

    @Test
    void printSpringBeans() {
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    void findById() {
        User user = userMapper.findById(1);
        System.out.println(user);
    }
}
