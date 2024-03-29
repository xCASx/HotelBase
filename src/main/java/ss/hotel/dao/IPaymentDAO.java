package ss.hotel.dao;

import java.util.List;
import ss.hotel.domain.Payment;

public interface IPaymentDAO {

	public void add(Payment payment);

	public Payment get(Long id);

	public List<Payment> getAll();

	public void remove(Long id);

	public void update(Payment payment);
}
