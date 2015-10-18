package com.wms.core.modules.utils;

import com.wms.core.business.common.model.Address;

public interface GeoLocation {
	
	Address getAddress(String ipAddress) throws Exception;

}
