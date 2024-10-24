package learn.shared.config.mybatis;

import javax.annotation.Resource;
import lombok.Getter;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.support.DaoSupport;
import org.springframework.util.Assert;

public abstract class CustomDaoSupport extends DaoSupport {

    private SqlSessionFactory sqlSessionFactoryForUser;

    private SqlSessionFactory sqlSessionFactoryForOrder;

    @Getter
    private SqlSession sqlSessionForUser;

    @Getter
    private SqlSession sqlSessionForOrder;

    @Autowired
    @Qualifier("sqlSessionFactoryForUser")
    public void setSqlSessionFactoryForUser(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactoryForUser = sqlSessionFactory;
    }

    @Resource(name = "sqlSessionFactoryForOrder")
    public void setSqlSessionFactoryForOrder(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactoryForOrder = sqlSessionFactory;
    }

    public String getStatement() {
        String fqcn = getClass().getCanonicalName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();

        return fqcn + "." + methodName;
    }

    @Override
    protected void checkDaoConfig() {
        Assert.notNull(sqlSessionFactoryForUser, "Property 'sqlSessionFactoryForUser' is required");
        Assert.notNull(sqlSessionFactoryForOrder, "Property 'sqlSessionFactoryForOrder' is required");
    }

    @Override
    protected void initDao() {
        sqlSessionForUser = new SqlSessionTemplate(sqlSessionFactoryForUser);
        sqlSessionForOrder = new SqlSessionTemplate(sqlSessionFactoryForOrder);
    }
}
