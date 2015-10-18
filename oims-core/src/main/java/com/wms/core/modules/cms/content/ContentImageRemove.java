package com.wms.core.modules.cms.content;


import com.wms.core.business.content.model.FileContentType;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.modules.cms.common.ImageRemove;

public interface ContentImageRemove extends ImageRemove {
	
	
	
	public void removeImage(final String merchantStoreCode,final FileContentType imageContentType, final String imageName) throws ServiceException;

}
