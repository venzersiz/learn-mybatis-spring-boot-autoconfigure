package learn.app.order.domain.repository;

import java.util.List;
import learn.shared.order.domain.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppOrderMapper {

    List<Order> findAll();
}
