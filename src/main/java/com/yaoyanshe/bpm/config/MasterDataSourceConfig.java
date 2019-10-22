package com.yaoyanshe.bpm.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author by lishuailei
 * @classname MasterDataSourceConfig
 * @description TODO
 * @date 2019/10/11
 */
@Component
public class MasterDataSourceConfig {

  @Bean(name = "masterTransactionManager")
  public PlatformTransactionManager masterTransactionManager(@Qualifier("masterDataSource") DataSource masterDataSource) {
    return new DataSourceTransactionManager(masterDataSource);
  }

  /**
   * 提供SqlSession
   */
  @Bean
  public SqlSessionFactory sqlSessionFactoryBean(@Qualifier("masterDataSource") DataSource masterDataSource) throws Exception {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(masterDataSource);
    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
    configuration.setMapUnderscoreToCamelCase(true);
    sqlSessionFactoryBean.setConfiguration(configuration);
    sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis-mapping/*.xml"));
    return sqlSessionFactoryBean.getObject();
  }
}
