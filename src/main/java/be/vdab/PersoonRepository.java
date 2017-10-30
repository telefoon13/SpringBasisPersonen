package be.vdab;

import java.io.IOException;
import java.util.List;

interface PersoonRepository {
	List<Persoon> findAll() throws IOException;
}
