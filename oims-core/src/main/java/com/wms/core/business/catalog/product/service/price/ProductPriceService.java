package com.wms.core.business.catalog.product.service.price;

import com.wms.core.business.catalog.product.model.price.ProductPrice;
import com.wms.core.business.catalog.product.model.price.ProductPriceDescription;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.generic.service.SalesManagerEntityService;

public interface ProductPriceService extends SalesManagerEntityService<Long, ProductPrice> {

	void addDescription(ProductPrice price, ProductPriceDescription description) throws ServiceException;

	void saveOrUpdate(ProductPrice price) throws ServiceException;
	

}
