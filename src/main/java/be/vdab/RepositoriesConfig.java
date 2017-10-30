package be.vdab;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.File;

@Configuration
@PropertySource("classpath:databestanden.properties")
public class RepositoriesConfig {

	@Bean
	@Qualifier("CSV")
	PersoonRepository persoonRepositoryCSV(@Value("${persoonCSV}")File file){
		return new PersoonRepositoryCSV(file);
	}

	@Bean
	@Qualifier("TXT")
	PersoonRepository persoonRepositoryTXT(@Value("${persoonTXT}")File file){
		return new PersoonRepositoryTXT(file);
	}
}
