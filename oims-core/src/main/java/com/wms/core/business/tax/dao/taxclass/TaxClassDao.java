package com.wms.core.business.tax.dao.taxclass;

import java.util.List;

import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.tax.model.taxclass.TaxClass;

public interface TaxClassDao  extends SalesManagerEntityDao<Long, TaxClass> {

	List<TaxClass> listByStore(MerchantStore store);

	TaxClass getByCode(String code);

	TaxClass getByCode(String code, MerchantStore store);

}
