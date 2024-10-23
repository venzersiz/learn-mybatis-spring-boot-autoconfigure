package learn.shared.config.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class DaoSupport extends SqlSessionDaoSupport {

    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public String getStatement() {
        String fqcn = getClass().getCanonicalName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();

        return fqcn + "." + methodName;
    }
}
