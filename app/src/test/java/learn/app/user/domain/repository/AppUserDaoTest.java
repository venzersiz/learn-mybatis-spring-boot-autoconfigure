package learn.app.user.domain.repository;

import learn.shared.user.domain.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppUserDaoTest {

    @Autowired
    AppUserDao appUserDao;

    @Test
    void findById() {
        User user = appUserDao.findById(1);
        System.out.println(user);
    }
}
