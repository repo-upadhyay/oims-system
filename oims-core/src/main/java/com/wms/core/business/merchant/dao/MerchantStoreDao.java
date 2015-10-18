package com.wms.core.business.merchant.dao;

import java.util.Collection;

import com.wms.core.business.catalog.product.model.Product;
import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.merchant.model.MerchantStore;

public interface MerchantStoreDao extends SalesManagerEntityDao<Integer, MerchantStore> {
	
	public Collection<Product> getProducts(MerchantStore merchantStore) throws ServiceException;
	
	public MerchantStore getMerchantStore(Integer merchantStoreId);

	public MerchantStore getMerchantStore(String code) throws ServiceException;
}
