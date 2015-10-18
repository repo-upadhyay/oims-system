package com.wms.core.business.shoppingcart.dao;

import org.springframework.stereotype.Repository;

import com.wms.core.business.generic.dao.SalesManagerEntityDaoImpl;
import com.wms.core.business.shoppingcart.model.ShoppingCartItem;

@Repository("shoppingCartItemDao")
public class ShoppingCartItemDaoImpl extends SalesManagerEntityDaoImpl<Long, ShoppingCartItem>
		implements ShoppingCartItemDao {
	


}
