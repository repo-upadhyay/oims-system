package com.wms.core.business.reference.init.service;

import com.wms.core.business.generic.exception.ServiceException;

public interface InitializationDatabase {
	
	boolean isEmpty();
	
	void populate(String name) throws ServiceException;

}
