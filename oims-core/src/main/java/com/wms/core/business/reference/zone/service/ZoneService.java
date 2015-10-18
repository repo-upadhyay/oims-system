package com.wms.core.business.reference.zone.service;

import java.util.List;
import java.util.Map;

import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.generic.service.SalesManagerEntityService;
import com.wms.core.business.reference.country.model.Country;
import com.wms.core.business.reference.language.model.Language;
import com.wms.core.business.reference.zone.model.Zone;
import com.wms.core.business.reference.zone.model.ZoneDescription;

public interface ZoneService extends SalesManagerEntityService<Long, Zone> {
	
	Zone getByCode(String code);

	void addDescription(Zone zone, ZoneDescription description) throws ServiceException;

	List<Zone> getZones(Country country, Language language)
			throws ServiceException;

	Map<String, Zone> getZones(Language language) throws ServiceException;


}
