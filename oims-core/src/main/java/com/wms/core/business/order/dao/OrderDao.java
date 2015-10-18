package com.wms.core.business.order.dao;

import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.order.model.Order;
import com.wms.core.business.order.model.OrderCriteria;
import com.wms.core.business.order.model.OrderList;

public interface OrderDao extends SalesManagerEntityDao<Long, Order> {
	
	OrderList listByStore(MerchantStore store, OrderCriteria criteria);

}