package com.wms.core.business.catalog.product.dao.relationship;

import java.util.List;

import com.wms.core.business.catalog.product.model.Product;
import com.wms.core.business.catalog.product.model.relationship.ProductRelationship;
import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.reference.language.model.Language;

public interface ProductRelationshipDao extends SalesManagerEntityDao<Long, ProductRelationship> {

	List<ProductRelationship> getByType(MerchantStore store, String type, Product product, Language language);

	List<ProductRelationship> getByType(MerchantStore store, String type,
			Product product);

	List<ProductRelationship> getByType(MerchantStore store, String type);

	List<ProductRelationship> listByProducts(Product product);

	List<ProductRelationship> getByType(MerchantStore store, String type,
			Language language);

	List<ProductRelationship> getGroups(MerchantStore store);

	List<ProductRelationship> getByGroup(MerchantStore store, String group);



}
