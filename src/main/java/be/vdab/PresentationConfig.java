package be.vdab;

import org.springframework.context.annotation.Bean;

class PresentationConfig {
	@Bean
	PersoonViewer persoonViewer(PersoonService persoonService){
		return new PersoonViewer(
				new PersoonEigenschappen[]
						{PersoonEigenschappen.PERSOON_NR, PersoonEigenschappen.FAMILIENAAM, PersoonEigenschappen.VOORNAAM, PersoonEigenschappen.AANTAL_KINDEREN}
				,persoonService);
	}
}
