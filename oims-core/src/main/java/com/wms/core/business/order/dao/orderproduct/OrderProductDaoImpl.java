package com.wms.core.business.order.dao.orderproduct;

import org.springframework.stereotype.Repository;

import com.wms.core.business.generic.dao.SalesManagerEntityDaoImpl;
import com.wms.core.business.order.model.orderproduct.OrderProduct;

@Repository("orderProductDao")
public class OrderProductDaoImpl extends SalesManagerEntityDaoImpl<Long, OrderProduct> implements OrderProductDao{

	
	public OrderProductDaoImpl() {
		super();
	}
}
