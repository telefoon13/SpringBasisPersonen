package be.vdab;

import java.io.IOException;
import java.util.List;

public interface PersoonService {
	List<Persoon> findAll() throws IOException;
}
