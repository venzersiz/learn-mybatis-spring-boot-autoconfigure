package learn.app.user.domain.repository;

import learn.shared.user.domain.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppUserMapper {

    User findById(long seq);
}
