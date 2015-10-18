package com.wms.core.business.customer.dao.attribute;

import java.util.List;

import com.wms.core.business.customer.model.attribute.CustomerOption;
import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.reference.language.model.Language;

public interface CustomerOptionDao extends SalesManagerEntityDao<Long, CustomerOption> {

	List<CustomerOption> listByStore(MerchantStore store, Language language);



	void saveOrUpdate(CustomerOption entity) throws ServiceException;


	/**
	 * Get a unique CustomerOption by code
	 * @param store
	 * @param optionCode
	 * @return
	 */
	CustomerOption getByCode(MerchantStore store, String optionCode);

}
