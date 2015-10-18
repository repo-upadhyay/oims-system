package com.wms.core.business.system.dao;

import org.springframework.stereotype.Repository;

import com.wms.core.business.generic.dao.SalesManagerEntityDaoImpl;
import com.wms.core.business.system.model.SystemConfiguration;

@Repository("systemConfigurationDao")
public class SystemConfigurationDaoImpl extends SalesManagerEntityDaoImpl<Long, SystemConfiguration>
		implements SystemConfigurationDao {



}
