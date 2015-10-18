package com.wms.core.modules.cms.common;

import java.util.List;

import com.wms.core.business.content.model.FileContentType;
import com.wms.core.business.content.model.OutputContentFile;
import com.wms.core.business.generic.exception.ServiceException;

public interface ImageGet
{

    public List<OutputContentFile> getImages( final String merchantStoreCode, FileContentType imageContentType )
        throws ServiceException;

}
