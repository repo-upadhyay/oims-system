package com.wms.core.business.catalog.product.dao.attribute;

import java.util.List;

import com.wms.core.business.catalog.product.model.attribute.ProductOption;
import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.reference.language.model.Language;

public interface ProductOptionDao extends SalesManagerEntityDao<Long, ProductOption> {

	List<ProductOption> listByStore(MerchantStore store, Language language);

	List<ProductOption> getByName(MerchantStore store, String name,
			Language language);

	void saveOrUpdate(ProductOption entity) throws ServiceException;

	/**
	 * Get read only attributes.
	 * @param store
	 * @param language
	 * @return
	 */
	List<ProductOption> getReadOnly(MerchantStore store,
			Language language);

	ProductOption getByCode(MerchantStore store, String optionCode);

}
