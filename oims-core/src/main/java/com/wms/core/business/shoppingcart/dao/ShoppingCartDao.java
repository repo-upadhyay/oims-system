package com.wms.core.business.shoppingcart.dao;

import com.wms.core.business.customer.model.Customer;
import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.shoppingcart.model.ShoppingCart;

public interface ShoppingCartDao extends SalesManagerEntityDao<Long, ShoppingCart> {

	ShoppingCart getById(Long id, MerchantStore store);

	ShoppingCart getByCustomer(Customer customer);

	ShoppingCart getByCode(String code, MerchantStore store);

	/**
	 * Get a ShoppingCart object without collection objects
	 * @param id
	 * @return
	 */
	ShoppingCart getShoppingCartById(Long id);

	/**
	 * Get a ShoppingCart object without collection objects
	 * @param code
	 * @return
	 */
	ShoppingCart getShoppingCartByCode(String code);

	public void removeShoppingCart(ShoppingCart cart);



}
