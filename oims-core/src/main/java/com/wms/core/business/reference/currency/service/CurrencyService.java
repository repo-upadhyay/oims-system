package com.wms.core.business.reference.currency.service;

import com.wms.core.business.generic.service.SalesManagerEntityService;
import com.wms.core.business.reference.currency.model.Currency;

public interface CurrencyService extends SalesManagerEntityService<Long, Currency> {

	Currency getByCode(String code);

}
