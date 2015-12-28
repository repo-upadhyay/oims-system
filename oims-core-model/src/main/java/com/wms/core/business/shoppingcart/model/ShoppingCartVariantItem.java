package com.wms.core.business.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

import com.wms.core.business.catalog.product.model.variant.ProductVariant;
import com.wms.core.business.common.model.audit.AuditListener;
import com.wms.core.business.common.model.audit.AuditSection;
import com.wms.core.business.common.model.audit.Auditable;
import com.wms.core.business.generic.model.SalesManagerEntity;


@Entity
@EntityListeners(value = AuditListener.class)
@Table(name = "SHOPPING_CART_VRNT_ITEM")
public class ShoppingCartVariantItem extends SalesManagerEntity<Long, ShoppingCartVariantItem> implements Auditable {


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SHP_CART_VRNT_ITEM_ID", unique=true, nullable=false)
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", pkColumnValue = "SHP_CRT_VRNT_ITM_SEQ_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Long id;

	@Embedded
	private AuditSection auditSection = new AuditSection();
	

	
	@Column(name="PRODUCT_VRNT_ID", nullable=false)
	private Long productVariantId;
	
	@Transient
	private ProductVariant productVariant;
	

	
	@ManyToOne(targetEntity = ShoppingCartItem.class)
	@JoinColumn(name = "SHP_CART_ITEM_ID", nullable = false)
	private ShoppingCartItem shoppingCartItem;
	
	public ShoppingCartVariantItem(ShoppingCartItem shoppingCartItem, ProductVariant productVariant) {
		this.shoppingCartItem = shoppingCartItem;
		this.productVariant = productVariant;
		this.productVariantId = productVariant.getId();
	}
	
	public ShoppingCartVariantItem() {

	}
	
	

	public ShoppingCartItem getShoppingCartItem() {
		return shoppingCartItem;
	}

	public void setShoppingCartItem(ShoppingCartItem shoppingCartItem) {
		this.shoppingCartItem = shoppingCartItem;
	}

	@Override
	public AuditSection getAuditSection() {
		return auditSection;
	}

	@Override
	public void setAuditSection(AuditSection audit) {
		this.auditSection = audit;
		
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
		
	}


	public void setProductVariantId(Long productVariantId) {
		this.productVariantId = productVariantId;
	}

	public Long getProductVariantId() {
		return productVariantId;
	}

	public void setProductVariant(ProductVariant productVariant) {
		this.productVariant = productVariant;
	}

	public ProductVariant getProductVariant() {
		return productVariant;
	}


}
