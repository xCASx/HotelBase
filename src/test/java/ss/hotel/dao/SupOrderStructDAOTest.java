package ss.hotel.dao;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ss.hotel.dao.IArticleDAO;
import ss.hotel.dao.ISupOrderStructDAO;
import ss.hotel.dao.ISupplierDAO;
import ss.hotel.dao.ISupplierOrderDAO;
import ss.hotel.domain.Article;

import java.util.Date;
import java.util.List;
import org.junit.Ignore;
import ss.hotel.domain.SupOrderStructure;

/**
 * ArticleDAO Tester.
 *
 * author: Victor
 */
@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class SupOrderStructDAOTest {

  //@Autowired
    private ISupOrderStructDAO dao;

    /**
     * Method: add(Article article)
     */
@Ignore
    @Test
	public void testAdd() throws Exception {
    	SupOrderStructure order = GenereateObjectHelper.getNewSupOrderStructure();

		dao.add(order);
		List<SupOrderStructure> orderList = dao.getAll();

		Assert.assertEquals(order, orderList.get(orderList.size() - 1));
	}

	/**
     * Method: getArticle(Integer articleId)
     */
@Ignore
    @Test
	public void testGetOrder() throws Exception {

    	SupOrderStructure order = GenereateObjectHelper.getNewSupOrderStructure();

		dao.add(order);
		List<SupOrderStructure> orderList = dao.getAll();
		SupOrderStructure loadedOrder = orderList.get(orderList.size() - 1);
		Long loadedOrderId = loadedOrder.getId();
		Assert.assertEquals(loadedOrder, dao.get(loadedOrderId));
	}


}
