package com.niit.backend.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
@Configurable
public class DatabaseConfig {
	@Bean(name="dataSource")
public DataSource getDataSource()
{
	BasicDataSource dataSource=new BasicDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUsername("sa");
	dataSource.setPassword("sa");
	dataSource.setUrl("jdbc:h2:tcp://localhost/~/pradeephasriram");
	return dataSource;
}
	@Bean(name="sessionFactory")
public SessionFactory getSessionFactory()
{
	LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(getDataSource());
	sessionBuilder.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");//language of h2  name of lamnguage
	sessionBuilder.setProperty("hibernate.show_sql", "true");//to show the sql commands
	sessionBuilder.setProperty("hibernate.hbm2ddl.auto", "update");//to add things,it wont create new table
	sessionBuilder.scanPackages("com.niit.backend.model");//take all the classes
	return sessionBuilder.buildSessionFactory();
}
public HibernateTransactionManager geTransaction()
{
	HibernateTransactionManager hibernateTransactionManager= new HibernateTransactionManager();
	return hibernateTransactionManager;
}
}
