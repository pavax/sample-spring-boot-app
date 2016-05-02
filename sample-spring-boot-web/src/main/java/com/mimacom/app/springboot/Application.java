package com.mimacom.app.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Application extends SpringBootServletInitializer {

//    @Configuration
//    public static class HibernateConfiguration extends HibernateJpaAutoConfiguration {
//
//        public HibernateConfiguration(DataSource dataSource, JpaProperties jpaProperties, ObjectProvider<JtaTransactionManager> jtaTransactionManagerProvider) {
//            super(dataSource, jpaProperties, jtaTransactionManagerProvider);
//        }
//
//        @Bean
//        @Override
//        public LocalContainerEntityManagerFactoryBean entityManagerFactory(
//                EntityManagerFactoryBuilder factoryBuilder) {
//            final LocalContainerEntityManagerFactoryBean ret = super.entityManagerFactory(factoryBuilder);
//            ret.setMappingResources("META-INF/orm.xml");
//            return ret;
//        }
//    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
