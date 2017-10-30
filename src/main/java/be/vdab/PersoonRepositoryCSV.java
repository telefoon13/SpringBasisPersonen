package be.vdab;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PersoonRepositoryCSV implements PersoonRepository {

	private final File file;

	public PersoonRepositoryCSV(File file) {
		this.file = file;
	}

	@Override
	public List<Persoon> findAll() throws IOException{
		List<Persoon> personen = new ArrayList<>();
		try(Scanner scanner = new Scanner(file)){
			while (scanner.hasNext()) {
				String[] onderdelen = scanner.nextLine().split(",");
				personen.add(new Persoon(Integer.parseInt(onderdelen[0]), onderdelen[1], onderdelen[2], Integer.parseInt(onderdelen[3])));
			}
		}
		return personen;
	}
}
