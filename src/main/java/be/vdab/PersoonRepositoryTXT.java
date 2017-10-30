package be.vdab;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PersoonRepositoryTXT implements PersoonRepository {

	private final File file;

	public PersoonRepositoryTXT(File file) {
		this.file = file;
	}

	@Override
	public List<Persoon> findAll() throws IOException {
		List<Persoon> personen = new ArrayList<>();
		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNext()) {
				int persoonNr = scanner.nextInt();
				scanner.nextLine();
				String voornaam = scanner.nextLine();
				String familienaam = scanner.nextLine();
				int aantalKinderen = scanner.nextInt();
				if (scanner.hasNext()) {
					scanner.nextLine();
				}
				personen.add(new Persoon(persoonNr, voornaam, familienaam, aantalKinderen));
			}
		}
		return personen;
	}
}
