package com.wms.core.business.catalog.product.service.variant;

import java.util.List;

import com.wms.core.business.catalog.product.model.Product;
import com.wms.core.business.catalog.product.model.variant.ProductVariant;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.generic.service.SalesManagerEntityService;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.reference.language.model.Language;

public interface ProductVariantService extends
		SalesManagerEntityService<Long, ProductVariant> {

	void saveOrUpdate(ProductVariant productAttribute)
			throws ServiceException;
	
	List<ProductVariant> getByOptionId(MerchantStore store,
			Long id) throws ServiceException;

	List<ProductVariant> getByOptionValueId(MerchantStore store,
			Long id) throws ServiceException;

	List<ProductVariant> getByProductId(MerchantStore store, Product product, Language language)
			throws ServiceException;

	List<ProductVariant> getByVariantIds(MerchantStore store, List<Long> ids)
			throws ServiceException;
}
