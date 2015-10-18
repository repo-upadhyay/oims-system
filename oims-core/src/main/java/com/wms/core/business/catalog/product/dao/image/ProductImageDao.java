package com.wms.core.business.catalog.product.dao.image;

import com.wms.core.business.catalog.product.model.image.ProductImage;
import com.wms.core.business.generic.dao.SalesManagerEntityDao;

public interface ProductImageDao extends SalesManagerEntityDao<Long, ProductImage> {

	ProductImage getProductImageById(Long id);

}
