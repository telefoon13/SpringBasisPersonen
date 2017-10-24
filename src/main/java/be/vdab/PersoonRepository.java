package be.vdab;

import java.io.IOException;
import java.util.List;

public interface PersoonRepository {
	public List<Persoon> findAll() throws IOException;
}
