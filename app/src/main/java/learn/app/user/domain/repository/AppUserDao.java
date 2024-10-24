package learn.app.user.domain.repository;

import learn.shared.config.mybatis.CustomDaoSupport;
import learn.shared.user.domain.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class AppUserDao extends CustomDaoSupport {

    public User findById(long seq) {

        return getSqlSessionForUser().selectOne(getStatement(), seq);
    }
}
