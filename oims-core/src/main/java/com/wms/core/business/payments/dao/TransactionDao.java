package com.wms.core.business.payments.dao;

import java.util.List;

import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.order.model.Order;
import com.wms.core.business.payments.model.Transaction;

public interface TransactionDao extends SalesManagerEntityDao<Long, Transaction> {

	List<Transaction> listByOrder(Order order);


	
}
