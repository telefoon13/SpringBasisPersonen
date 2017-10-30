package be.vdab;

import java.io.IOException;

class PersoonViewer {

	private final PersoonEigenschappen[] eigenschappen;
	private final PersoonService persoonService;

	public PersoonViewer(PersoonEigenschappen[] eigenschappen, PersoonService persoonService) {
		this.eigenschappen = eigenschappen;
		this.persoonService = persoonService;
	}

	public void afbeelden() throws IOException {
		for (Persoon persoon : persoonService.findAll()) {
			for (PersoonEigenschappen eigenschap : eigenschappen) {
				toonEigenschap(persoon, eigenschap);
				System.out.print(' ');
			}
			System.out.println();
		}
	}

	private void toonEigenschap(Persoon persoon, PersoonEigenschappen eigenschap) {
		switch (eigenschap){
			case PERSOON_NR:
				System.out.print(persoon.getPersoonNr());
				break;
			case FAMILIENAAM:
				System.out.print(persoon.getFamilienaam());
				break;
			case VOORNAAM:
				System.out.print(persoon.getVoornaam());
				break;
			case AANTAL_KINDEREN:
				System.out.print(persoon.getAantalKinderen());
				break;
		}
	}
}