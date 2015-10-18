package com.wms.core.modules.cms.product;

import com.wms.core.business.catalog.product.model.Product;
import com.wms.core.business.catalog.product.model.image.ProductImage;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.modules.cms.common.ImageRemove;


public interface ProductImageRemove extends ImageRemove {
	
	
	public void removeProductImage(ProductImage productImage) throws ServiceException;
	public void removeProductImages(Product product) throws ServiceException;
	


}
