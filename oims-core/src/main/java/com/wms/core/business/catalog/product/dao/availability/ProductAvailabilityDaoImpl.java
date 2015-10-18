package com.wms.core.business.catalog.product.dao.availability;

import org.springframework.stereotype.Repository;

import com.wms.core.business.catalog.product.model.availability.ProductAvailability;
import com.wms.core.business.generic.dao.SalesManagerEntityDaoImpl;

@Repository("productAvailabilityDao")
public class ProductAvailabilityDaoImpl extends SalesManagerEntityDaoImpl<Long, ProductAvailability>
		implements ProductAvailabilityDao {



}
