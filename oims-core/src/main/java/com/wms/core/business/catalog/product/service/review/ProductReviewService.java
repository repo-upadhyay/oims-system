package com.wms.core.business.catalog.product.service.review;

import java.util.List;

import com.wms.core.business.catalog.product.model.Product;
import com.wms.core.business.catalog.product.model.review.ProductReview;
import com.wms.core.business.customer.model.Customer;
import com.wms.core.business.generic.service.SalesManagerEntityService;
import com.wms.core.business.reference.language.model.Language;

public interface ProductReviewService extends
		SalesManagerEntityService<Long, ProductReview> {
	
	
	List<ProductReview> getByCustomer(Customer customer);
	List<ProductReview> getByProduct(Product product);
	List<ProductReview> getByProduct(Product product, Language language);
	ProductReview getByProductAndCustomer(Long productId, Long customerId);



}
