package com.wms.core.business.customer.dao.attribute;

import java.util.List;

import com.wms.core.business.customer.model.attribute.CustomerOptionValue;
import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.reference.language.model.Language;

public interface CustomerOptionValueDao extends SalesManagerEntityDao<Long, CustomerOptionValue> {

	List<CustomerOptionValue> listByStore(MerchantStore store, Language language);

	CustomerOptionValue getByCode(MerchantStore store, String optionValueCode);



}
