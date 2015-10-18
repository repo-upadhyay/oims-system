package com.wms.core.business.system.service;

import java.util.List;

import com.wms.core.business.generic.service.SalesManagerEntityService;
import com.wms.core.business.system.model.IntegrationModule;

public interface ModuleConfigurationService extends
		SalesManagerEntityService<Long, IntegrationModule> {

	List<IntegrationModule> getIntegrationModules(String module);

	IntegrationModule getByCode(String moduleCode);
	


}
