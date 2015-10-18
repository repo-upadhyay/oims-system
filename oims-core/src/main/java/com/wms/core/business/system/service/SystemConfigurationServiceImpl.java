package com.wms.core.business.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wms.core.business.system.model.SystemConfiguration_;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.generic.service.SalesManagerEntityServiceImpl;
import com.wms.core.business.system.dao.SystemConfigurationDao;
import com.wms.core.business.system.model.SystemConfiguration;

@Service("systemConfigurationService")
public class SystemConfigurationServiceImpl extends
		SalesManagerEntityServiceImpl<Long, SystemConfiguration> implements
		SystemConfigurationService {

	
	private SystemConfigurationDao systemConfigurationDao;
	
	@Autowired
	public SystemConfigurationServiceImpl(
			SystemConfigurationDao systemConfigurationDao) {
			super(systemConfigurationDao);
			this.systemConfigurationDao = systemConfigurationDao;
	}
	
	public SystemConfiguration getByKey(String key) throws ServiceException {
		return super.getByField(SystemConfiguration_.key, key);
	}
	



}
