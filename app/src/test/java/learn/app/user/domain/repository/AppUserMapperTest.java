package learn.app.user.domain.repository;

import learn.app.Application;
import learn.shared.user.domain.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
class AppUserMapperTest {

    @Autowired
    AppUserMapper appUserMapper;

    @Test
    void findById() {
        User user = appUserMapper.findById(1);
        System.out.println(user);
    }
}