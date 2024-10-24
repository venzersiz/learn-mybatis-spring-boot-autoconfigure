package learn;


import learn.app.AppApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = AppApplication.class)
public class SpringBeansTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void printSpringBeans() {
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            if (beanDefinitionName.contains("dataSource") || beanDefinitionName.contains("sqlSession")
                || beanDefinitionName.contains("Mapper") || beanDefinitionName.contains("Dao")) {
                System.out.println(beanDefinitionName);
            }
        }
    }
}
