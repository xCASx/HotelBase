package ss.hotel.dao;

import java.util.List;
import ss.hotel.domain.Visit;

public interface IVisitDAO {

	public void add(Visit visit);

	public Visit get(Long id);

	public List<Visit> getAll();

	public void remove(Long id);

	public void update(Visit visit);
}
