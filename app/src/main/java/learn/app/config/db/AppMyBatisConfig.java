package learn.app.config.db;

import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScans({
    @MapperScan(basePackages = {"learn.shared.user.domain.repository", "learn.app.user.domain.repository"}, sqlSessionFactoryRef = "sqlSessionFactoryForUser"),
    @MapperScan(basePackages = {"learn.app.order.domain.repository"}, sqlSessionFactoryRef = "sqlSessionFactoryForOrder"),
})
@RequiredArgsConstructor
public class AppMyBatisConfig {

    private final ApplicationContext applicationContext;

    @Bean
    public SqlSessionFactory sqlSessionFactoryForUser(@Qualifier("dataSourceForUser") DataSource dataSource) throws Exception {

        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setMapperLocations(applicationContext.getResources("classpath*:/mybatis/mapper/user/**/*.xml"));
        factoryBean.setTypeAliasesPackage("learn.shared.**.domain.model");
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryForOrder(@Qualifier("dataSourceForOrder") DataSource dataSource) throws Exception {

        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setMapperLocations(applicationContext.getResources("classpath*:/mybatis/mapper/order/**/*.xml"));
        factoryBean.setTypeAliasesPackage("learn.shared.**.domain.model");
        return factoryBean.getObject();
    }
}
