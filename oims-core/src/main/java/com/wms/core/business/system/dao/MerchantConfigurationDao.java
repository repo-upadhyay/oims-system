package com.wms.core.business.system.dao;

import java.util.List;

import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.system.model.MerchantConfiguration;
import com.wms.core.business.system.model.MerchantConfigurationType;

public interface MerchantConfigurationDao extends SalesManagerEntityDao<Long, MerchantConfiguration> {

	
	
	MerchantConfiguration getMerchantConfiguration(String key, MerchantStore store);

	List<MerchantConfiguration> getMerchantConfigurations(MerchantStore store);

	List<MerchantConfiguration> listByType(MerchantConfigurationType type,
			MerchantStore store);
	
}
