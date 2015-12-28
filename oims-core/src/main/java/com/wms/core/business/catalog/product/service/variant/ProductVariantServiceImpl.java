package com.wms.core.business.catalog.product.service.variant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wms.core.business.catalog.product.dao.variant.ProductVariantDao;
import com.wms.core.business.catalog.product.model.Product;
import com.wms.core.business.catalog.product.model.variant.ProductVariant;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.generic.service.SalesManagerEntityServiceImpl;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.reference.language.model.Language;

@Service("productVariantService")
public class ProductVariantServiceImpl extends
		SalesManagerEntityServiceImpl<Long, ProductVariant> implements ProductVariantService {
	
	private ProductVariantDao productVariantDao;

	@Autowired
	public ProductVariantServiceImpl(ProductVariantDao productVariantDao) {
		super(productVariantDao);
		this.productVariantDao = productVariantDao;
	}
	
	@Override
	public ProductVariant getById(Long id) {
		
		return productVariantDao.getById(id);
		
	}
	
	
	@Override
	public List<ProductVariant> getByOptionId(MerchantStore store,
			Long id) throws ServiceException {
		
		return productVariantDao.getByOptionId(store, id);
		
	}
	
	@Override
	public List<ProductVariant> getByVariantIds(MerchantStore store,
			List<Long> ids) throws ServiceException {
		
		return productVariantDao.getByAttributeIds(store, ids);
		
	}
	
	@Override
	public List<ProductVariant> getByOptionValueId(MerchantStore store,
			Long id) throws ServiceException {
		
		return productVariantDao.getByOptionValueId(store, id);
		
	}
	
	/**
	 * Returns all product attributes
	 */
	@Override
	public List<ProductVariant> getByProductId(MerchantStore store,
			Product product, Language language) throws ServiceException {
		return productVariantDao.getByProduct(store, product, language);
		
	}


	@Override
	public void saveOrUpdate(ProductVariant productAttribute)
			throws ServiceException {
		if(productAttribute.getId()!=null && productAttribute.getId()>0) {
			productVariantDao.update(productAttribute);
		} else {
			productVariantDao.save(productAttribute);
		}
		
	}
	
	@Override
	public void delete(ProductVariant attribute) throws ServiceException {
		
		//override method, this allows the error that we try to remove a detached instance
		attribute = this.getById(attribute.getId());
		super.delete(attribute);
		
	}

}
