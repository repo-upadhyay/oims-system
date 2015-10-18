package com.wms.core.modules.cms.content;

import java.util.List;

import com.wms.core.business.content.model.InputContentFile;
import com.wms.core.business.generic.exception.ServiceException;

public interface ImagePut {
	
	
	public void addImage(final String merchantStoreCode, InputContentFile image) throws ServiceException;
	public void addImages(final String merchantStoreCode, List<InputContentFile> imagesList) throws ServiceException;

}
