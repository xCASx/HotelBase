package ss.hotel.dao;

import java.util.List;
import ss.hotel.domain.Order;

/**
 *
 * @author Kateryna
 */
public interface IOrderDAO {

    public void addOrder(Order order);

    public void updateOrder(Order order);

    public void removeOrder(Long id);

    public Order getOrder(Long id);

    public List<Order> getAllOrders();
}
