package com.wms.core.modules.cms.common;

import com.wms.core.business.generic.exception.ServiceException;


public interface ImageRemove {
	
	
	public void removeImages(final String merchantStoreCode) throws ServiceException;
	
}
