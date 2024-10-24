package learn.shared.user.domain.repository;

import learn.app.AppApplication;
import learn.shared.user.domain.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = AppApplication.class)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void findById() {
        User user = userMapper.findById(1);
        System.out.println(user);
    }
}
