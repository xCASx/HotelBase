package ss.hotel.dao;

import java.util.List;

import ss.hotel.domain.SalesRep;

public interface ISalesRepDAO {
	public void addSalesRep(SalesRep salesRep);
	public void updateSalesRep(SalesRep salesRep);
	public void removeSalesRep(Long id);
	public SalesRep getSalesRep(Long id);
	public List<SalesRep> getAllSalesReps();
}
