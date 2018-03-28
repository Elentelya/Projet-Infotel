package com.formation.dao.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration // definit cette classe comme conteneur Spring
@EnableTransactionManagement // permet les transactions
@PropertySource({ "classpath:configuration.properties" }) // fait appel au fichier de config dans src/main/resources
@ComponentScan({ "com.formation" }) // scan des packages
public class SpringConfig {

    @Autowired
    private Environment env;

    @Bean // bean de gestion de la sessionFactory que l'on pourra injecter dans la couche DAO
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(restDataSource());
        sessionFactory.setPackagesToScan(new String[] { "com.formation.dao.entities" });
        sessionFactory.setHibernateProperties(hibernateProperties());

        return sessionFactory;
    }

    @Bean // bean de connexion à la base de données
    public DataSource restDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.user"));
        dataSource.setPassword(env.getProperty("jdbc.pass"));

        return dataSource;
    }

    @Bean // bean de transaction, nécessite un @Transactionnal pour se connecter
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {

        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory);

        return txManager;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }
          
    // configuration des propriétés d'hibernate
    Properties hibernateProperties() {
        return new Properties() {
          
			private static final long serialVersionUID = 1L;

			{
            	// Configuration de "base"
                //setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
                setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
                setProperty("hibernate.globally_quoted_identifiers", "true");
                
                // Configuration du pool de connexion C3P0
                setProperty("hibernate.c3p0.min_size", env.getProperty("hibernate.c3p0.min_size"));
                setProperty("hibernate.c3p0.max_size", env.getProperty("hibernate.c3p0.max_size"));
                setProperty("hibernate.c3p0.acquire_increment", env.getProperty("hibernate.c3p0.acquire_increment"));
                setProperty("hibernate.c3p0.timeout", env.getProperty("hibernate.c3p0.timeout"));
                setProperty("hibernate.c3p0.max_statements", env.getProperty("hibernate.c3p0.max_statements"));
                setProperty("hibernate.show_sql", "true");
                setProperty("hibernate.format_sql", "true");
            }
        };
    }
}
