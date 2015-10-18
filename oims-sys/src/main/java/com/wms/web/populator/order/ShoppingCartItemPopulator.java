package com.wms.web.populator.order;

import org.apache.commons.lang3.Validate;

import com.wms.core.business.catalog.product.model.Product;
import com.wms.core.business.catalog.product.model.attribute.ProductAttribute;
import com.wms.core.business.catalog.product.service.ProductService;
import com.wms.core.business.catalog.product.service.attribute.ProductAttributeService;
import com.wms.core.business.generic.exception.ConversionException;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.reference.language.model.Language;
import com.wms.core.business.shoppingcart.model.ShoppingCartItem;
import com.wms.core.business.shoppingcart.service.ShoppingCartService;
import com.wms.core.utils.AbstractDataPopulator;
import com.wms.web.entity.order.PersistableOrderProduct;

public class ShoppingCartItemPopulator extends
		AbstractDataPopulator<PersistableOrderProduct, ShoppingCartItem> {
	

	private ProductService productService;
	private ProductAttributeService productAttributeService;
	private ShoppingCartService shoppingCartService;

	@Override
	public ShoppingCartItem populate(PersistableOrderProduct source,
			ShoppingCartItem target, MerchantStore store, Language language)
			throws ConversionException {
		Validate.notNull(productService, "Requires to set productService");
		Validate.notNull(productAttributeService, "Requires to set productAttributeService");
		Validate.notNull(shoppingCartService, "Requires to set shoppingCartService");
		
		Product product = productService.getById(source.getProduct().getId());
		if(source.getAttributes()!=null) {

			for(com.wms.web.entity.catalog.product.attribute.ProductAttribute attr : source.getAttributes()) {
				ProductAttribute attribute = productAttributeService.getById(attr.getId());
				if(attribute==null) {
					throw new ConversionException("ProductAttribute with id " + attr.getId() + " is null");
				}
				if(attribute.getProduct().getId().longValue()!=source.getProduct().getId().longValue()) {
					throw new ConversionException("ProductAttribute with id " + attr.getId() + " is not assigned to Product id " + source.getProduct().getId());
				}
				product.getAttributes().add(attribute);
			}
		}
		
		try {
			return shoppingCartService.populateShoppingCartItem(product);
		} catch (ServiceException e) {
			throw new ConversionException(e);
		}
		
	}

	@Override
	protected ShoppingCartItem createTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setProductAttributeService(ProductAttributeService productAttributeService) {
		this.productAttributeService = productAttributeService;
	}

	public ProductAttributeService getProductAttributeService() {
		return productAttributeService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setShoppingCartService(ShoppingCartService shoppingCartService) {
		this.shoppingCartService = shoppingCartService;
	}

	public ShoppingCartService getShoppingCartService() {
		return shoppingCartService;
	}

}
