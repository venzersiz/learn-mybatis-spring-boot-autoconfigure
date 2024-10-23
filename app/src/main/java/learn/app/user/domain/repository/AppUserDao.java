package learn.app.user.domain.repository;

import learn.shared.user.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AppUserDao {

    private final SqlSession sqlSession;

    public User findById(long seq) {

        String statement = "learn.app.user.domain.repository.AppUserDao.findById";

        return sqlSession.selectOne(statement, seq);
    }
}
