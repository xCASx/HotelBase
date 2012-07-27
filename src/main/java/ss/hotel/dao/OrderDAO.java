package ss.hotel.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ss.hotel.domain.Order;

/**
 *
 * @author Kateryna
 */
@Repository
public class OrderDAO implements IOrderDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addOrder(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }

    @Override
    public void updateOrder(Order order) {
        sessionFactory.getCurrentSession().update(order);
    }

    @Override
    public void removeOrder(Long id) {
        Order toDelete = (Order) sessionFactory.getCurrentSession().
                get(Order.class, id);
        if (toDelete != null) {
            sessionFactory.getCurrentSession().delete(toDelete);
        }
    }

    @Override
    public Order getOrder(Long id) {
        Order toReturn = (Order) sessionFactory.getCurrentSession().
                get(Order.class, id);
        return toReturn;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Order> getAllOrders() {
        List<Order> orders = sessionFactory.getCurrentSession().
                createQuery("from Order").list();
        return orders;
    }
}
