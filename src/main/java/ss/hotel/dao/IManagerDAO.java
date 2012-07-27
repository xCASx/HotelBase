package ss.hotel.dao;

import java.util.List;

import ss.hotel.domain.Manager;

public interface IManagerDAO {
	public void addManager(Manager manager);
	public void updateManager(Manager manager);
	public void removeManager(Long id);
	public Manager getManager(Long id);
	public List<Manager> getAllManagers();
}
