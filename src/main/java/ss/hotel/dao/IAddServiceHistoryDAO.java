package ss.hotel.dao;

import java.util.List;
import ss.hotel.domain.AddServiceHistory;

/**
 *
 * @author Kateryna
 */
public interface IAddServiceHistoryDAO {
    public void addAddServiceHistory(AddServiceHistory addServiceHistory);
	public void updateAddServiceHistory(AddServiceHistory addServiceHistory);
	public void removeAddServiceHistory(Long id);
	public AddServiceHistory getAddServiceHistory(Long id);
	public List<AddServiceHistory> getAllAddServiceHistories();

}
