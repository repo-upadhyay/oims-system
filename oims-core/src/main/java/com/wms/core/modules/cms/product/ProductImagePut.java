package com.wms.core.modules.cms.product;

import com.wms.core.business.catalog.product.model.image.ProductImage;
import com.wms.core.business.content.model.ImageContentFile;
import com.wms.core.business.generic.exception.ServiceException;


public interface ProductImagePut {
	
	
	public void addProductImage(ProductImage productImage, ImageContentFile contentImage) throws ServiceException;


}
