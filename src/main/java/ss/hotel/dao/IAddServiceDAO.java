package ss.hotel.dao;

import java.util.List;
import ss.hotel.domain.AddService;

/**
 *
 * @author Kateryna
 */
public interface IAddServiceDAO {
public void addAddService(AddService addService);
	public void updateAddService(AddService AddService);
	public void removeAddService(Long id);
	public AddService getAddService(Long id);
	public List<AddService> getAllAddServices();
}
