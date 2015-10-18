package com.wms.core.business.tax.dao.taxrate;

import java.util.List;

import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.reference.country.model.Country;
import com.wms.core.business.reference.language.model.Language;
import com.wms.core.business.reference.zone.model.Zone;
import com.wms.core.business.tax.model.taxclass.TaxClass;
import com.wms.core.business.tax.model.taxrate.TaxRate;

public interface TaxRateDao  extends SalesManagerEntityDao<Long, TaxRate> {

	List<TaxRate> listByStore(MerchantStore store);

	List<TaxRate> listByCountryZoneAndTaxClass(Country country, Zone zone,
			TaxClass taxClass, MerchantStore store, Language language);

	List<TaxRate> listByCountryStateProvinceAndTaxClass(Country country,
			String stateProvince, TaxClass taxClass, MerchantStore store,
			Language language);

	TaxRate getByCode(String code, MerchantStore store);

	List<TaxRate> listByStore(MerchantStore store, Language language);

}
