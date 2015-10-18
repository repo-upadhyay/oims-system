package com.wms.core.business.order.dao;

import org.springframework.stereotype.Repository;

import com.wms.core.business.generic.dao.SalesManagerEntityDaoImpl;
import com.wms.core.business.order.model.OrderTotal;

@Repository("orderTotalDao")
public class OrderTotalDaoImpl extends SalesManagerEntityDaoImpl<Long, OrderTotal> implements OrderTotalDao {

	public OrderTotalDaoImpl() {
		super();
	}
	
}
