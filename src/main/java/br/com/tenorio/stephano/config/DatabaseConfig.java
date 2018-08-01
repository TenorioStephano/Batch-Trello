package br.com.tenorio.stephano.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({ "classpath:application.properties" })
public class DatabaseConfig {

	@Autowired
	private Environment env;

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		 return
		 DataSourceBuilder.create().driverClassName(env.getProperty("SPRING_DATASOURCE_DRIVER"))
		 .url(env.getProperty("SPRING_DATASOURCE_URL")).username(env.getProperty("SPRING_DATASOURCE_USERNAME"))
		 .password(env.getProperty("SPRING_DATASOURCE_PASSWORD")).build();
	}
}