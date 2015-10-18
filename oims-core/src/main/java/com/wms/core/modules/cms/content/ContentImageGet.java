package com.wms.core.modules.cms.content;

import java.util.List;

import com.wms.core.business.content.model.FileContentType;
import com.wms.core.business.content.model.OutputContentFile;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.modules.cms.common.ImageGet;

public interface ContentImageGet extends ImageGet {
	
	public OutputContentFile getImage(final String merchantStoreCode, String imageName,FileContentType imageContentType) throws ServiceException;
	public List<String> getImageNames(final String merchantStoreCode, FileContentType imageContentType) throws ServiceException;

}
