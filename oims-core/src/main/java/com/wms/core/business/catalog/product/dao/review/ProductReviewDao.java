package com.wms.core.business.catalog.product.dao.review;

import java.util.List;

import com.wms.core.business.catalog.product.model.Product;
import com.wms.core.business.catalog.product.model.review.ProductReview;
import com.wms.core.business.customer.model.Customer;
import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.reference.language.model.Language;

public interface ProductReviewDao extends SalesManagerEntityDao<Long, ProductReview> {

	List<ProductReview> getByCustomer(Customer customer);
	List<ProductReview> getByProduct(Product product);
	List<ProductReview> getByProduct(Product product, Language language);
	ProductReview getByProductAndCustomer(Long productId, Long customerId);





}
