package com.wms.core.business.catalog.product.dao.variant;

import java.util.List;

import com.wms.core.business.catalog.product.model.Product;
import com.wms.core.business.catalog.product.model.variant.ProductVariant;
import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.reference.language.model.Language;

public interface ProductVariantDao extends SalesManagerEntityDao<Long, ProductVariant> {

	List<ProductVariant> getByOptionId(MerchantStore store,
			Long id);

	List<ProductVariant> getByOptionValueId(MerchantStore store,
			Long id);

	List<ProductVariant> getByProduct(MerchantStore store,
			Product product, Language language);

	List<ProductVariant> getByAttributeIds(MerchantStore store, List<Long> ids);

}
