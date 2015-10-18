package com.wms.core.business.catalog.product.service.type;

import com.wms.core.business.catalog.product.model.type.ProductType;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.generic.service.SalesManagerEntityService;

public interface ProductTypeService extends SalesManagerEntityService<Long, ProductType> {

	ProductType getProductType(String productTypeCode) throws ServiceException;

}
