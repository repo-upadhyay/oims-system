package com.wms.core.business.reference.country.dao;

import java.util.List;

import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.reference.country.model.Country;
import com.wms.core.business.reference.language.model.Language;

public interface CountryDao extends SalesManagerEntityDao<Integer,Country> {

	public List<Country> listByLanguage(Language language);
}
