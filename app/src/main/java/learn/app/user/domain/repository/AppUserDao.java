package learn.app.user.domain.repository;

import learn.shared.config.mybatis.DaoSupport;
import learn.shared.user.domain.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class AppUserDao extends DaoSupport {

    public User findById(long seq) {

        return getSqlSession().selectOne(getStatement(), seq);
    }
}
