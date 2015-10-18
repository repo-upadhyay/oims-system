package com.wms.core.business.catalog.product.dao.attribute;

import java.util.List;

import com.wms.core.business.catalog.product.model.Product;
import com.wms.core.business.catalog.product.model.attribute.ProductAttribute;
import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.reference.language.model.Language;

public interface ProductAttributeDao extends SalesManagerEntityDao<Long, ProductAttribute> {

	List<ProductAttribute> getByOptionId(MerchantStore store,
			Long id);

	List<ProductAttribute> getByOptionValueId(MerchantStore store,
			Long id);

	List<ProductAttribute> getByProduct(MerchantStore store,
			Product product, Language language);

	List<ProductAttribute> getByAttributeIds(MerchantStore store, List<Long> ids);

}
