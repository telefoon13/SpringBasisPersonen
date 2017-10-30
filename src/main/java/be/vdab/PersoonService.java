package be.vdab;

import java.io.IOException;
import java.util.List;

interface PersoonService {
	List<Persoon> findAll() throws IOException;
}
