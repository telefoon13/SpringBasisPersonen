package be.vdab;

import java.io.IOException;
import java.util.List;

public class PersoonServiceImpl implements PersoonService {

	private final PersoonRepository persoonRepository;

	public PersoonServiceImpl(PersoonRepository persoonRepository) {
		this.persoonRepository = persoonRepository;
	}

	@Override
	public List<Persoon> findAll() throws IOException {
		return persoonRepository.findAll();
	}
}
