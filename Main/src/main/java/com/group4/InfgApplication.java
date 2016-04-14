package com.group4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAsync
@EnableWebMvc
@EnableScheduling
@EnableAspectJAutoProxy
public class InfgApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfgApplication.class, args);
	}



//	/**
//	 * Create embedded database.
//	 *
//	 * @return an embedded data source.
//	 */
//	@Bean(destroyMethod = "shutdown")
//	public EmbeddedDatabase dataSource() {
//		return new EmbeddedDatabaseBuilder().
//				setType(EmbeddedDatabaseType.H2).
//				build();
//	}
}
