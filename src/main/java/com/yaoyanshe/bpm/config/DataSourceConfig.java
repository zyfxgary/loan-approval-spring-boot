package com.yaoyanshe.bpm.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.camunda.bpm.spring.boot.starter.configuration.impl.DefaultDatasourceConfiguration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author by lishuailei
 * @classname DataSourceConfig
 * @description 数据源配置类
 * @date 2019/10/11
 */
@Configuration
public class DataSourceConfig extends DefaultDatasourceConfiguration {

  @Bean(name = "masterDataSource")
  @Primary
  @ConfigurationProperties(prefix = "spring.datasource.first")
  public DataSource firstDataSource() {
    return DataSourceBuilder.create().type(BasicDataSource.class).build();
  }


  @Bean(name="camundaBpmDataSource")
  @ConfigurationProperties(prefix = "spring.datasource.bpm")
  public DataSource bpmDataSource() {
    return DataSourceBuilder.create().type(BasicDataSource.class).build();
  }


  @Bean
  public PlatformTransactionManager transactionManager(){
    return new DataSourceTransactionManager(bpmDataSource());
  }

}
