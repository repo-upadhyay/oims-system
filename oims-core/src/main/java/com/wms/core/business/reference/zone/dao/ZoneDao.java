package com.wms.core.business.reference.zone.dao;

import java.util.List;

import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.reference.country.model.Country;
import com.wms.core.business.reference.language.model.Language;
import com.wms.core.business.reference.zone.model.Zone;


public interface ZoneDao extends SalesManagerEntityDao<Long,Zone> {

	List<Zone> listByLanguageAndCountry(Country country, Language language);

	List<Zone> listByLanguage(Language language);

}
