package learn.shared.user.domain.repository;

import learn.shared.user.domain.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findById(long seq);
}
