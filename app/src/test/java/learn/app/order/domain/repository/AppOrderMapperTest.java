package learn.app.order.domain.repository;

import java.util.List;
import learn.app.AppApplication;
import learn.shared.order.domain.model.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = AppApplication.class)
class AppOrderMapperTest {

    @Autowired
    AppOrderMapper appOrderMapper;

    @Test
    void findAll() {
        List<Order> orders = appOrderMapper.findAll();
        System.out.println(orders);
    }
}
