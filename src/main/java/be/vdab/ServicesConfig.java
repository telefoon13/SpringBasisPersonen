package be.vdab;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

	@Bean
	PersoonService persoonService(@Qualifier("CSV") PersoonRepository persoonRepository){
		return new PersoonServiceImpl(persoonRepository);
	}
}
