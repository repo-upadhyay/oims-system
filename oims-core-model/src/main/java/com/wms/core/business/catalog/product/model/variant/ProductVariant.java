package com.wms.core.business.catalog.product.model.variant;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.wms.core.business.catalog.product.model.Product;
import com.wms.core.business.catalog.product.model.attribute.ProductOption;
import com.wms.core.business.catalog.product.model.attribute.ProductOptionValue;
import com.wms.core.business.generic.model.SalesManagerEntity;

@Entity
@Table(name="PRODUCT_VARIANT", 
	uniqueConstraints={
		@UniqueConstraint(columnNames={
				"OPTION_ID",
				"OPTION_VALUE_ID",
				"PRODUCT_ID"
			})
	}
)
public class ProductVariant extends SalesManagerEntity<Long, ProductVariant> {
	private static final long serialVersionUID = -6537491946539803265L;
	
	@Id
	@Column(name = "PRODUCT_VARIANT_ID", unique=true, nullable=false)
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", pkColumnValue = "PRODUCT_VRNT_SEQ_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Long id;

	
	@Column(name="PRODUCT_ATRIBUTE_PRICE")
	private BigDecimal productAttributePrice;


	@Column(name="PRODUCT_VARIANT_SORT_ORD")
	private Integer productOptionSortOrder;
	
	@Column(name="PRODUCT_VARIANT_FREE")
	private boolean productAttributeIsFree;
	

	@Column(name="PRODUCT_VARIANT_WEIGHT")
	private BigDecimal productAttributeWeight;
	
	@Column(name="PRODUCT_VARIANT_DEFAULT")
	private boolean variantDefault=false;
	
	@Column(name="PRODUCT_VARIANT_REQUIRED")
	private boolean variantRequired=false;
	
	/**
	 * a read only variant is considered as a core variant addition
	 */
	@Column(name="PRODUCT_VARIANT_FOR_DISP")
	private boolean variantDisplayOnly=false;
	

	@Column(name="PRODUCT_VARIANT_DISCOUNTED")
	private boolean variantDiscounted=false;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="OPTION_ID", nullable=false)
	private ProductOption productOption;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="OPTION_VALUE_ID", nullable=false)
	private ProductOptionValue productOptionValue;
	
	
	/**
	 * This transient object property
	 * is a utility used only to submit from a free text
	 */
	@Transient
	private String variantPrice = "0";
	
	
	/**
	 * This transient object property
	 * is a utility used only to submit from a free text
	 */
	@Transient
	private String variantSortOrder = "0";
	


	/**
	 * This transient object property
	 * is a utility used only to submit from a free text
	 */
	@Transient
	private String variantAdditionalWeight = "0";
	
	public String getAttributePrice() {
		return variantPrice;
	}

	public void setAttributePrice(String variantPrice) {
		this.variantPrice = variantPrice;
	}

	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name = "PRODUCT_ID", nullable = false)
	private Product product;
	
	public ProductVariant() {
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}



	public Integer getProductOptionSortOrder() {
		return productOptionSortOrder;
	}

	public void setProductOptionSortOrder(Integer productOptionSortOrder) {
		this.productOptionSortOrder = productOptionSortOrder;
	}

	public boolean getProductAttributeIsFree() {
		return productAttributeIsFree;
	}

	public void setProductAttributeIsFree(boolean productAttributeIsFree) {
		this.productAttributeIsFree = productAttributeIsFree;
	}

	public BigDecimal getProductAttributeWeight() {
		return productAttributeWeight;
	}

	public void setProductAttributeWeight(BigDecimal productAttributeWeight) {
		this.productAttributeWeight = productAttributeWeight;
	}

	public boolean getAttributeDefault() {
		return variantDefault;
	}

	public void setAttributeDefault(boolean variantDefault) {
		this.variantDefault = variantDefault;
	}

	public boolean getAttributeRequired() {
		return variantRequired;
	}

	public void setAttributeRequired(boolean variantRequired) {
		this.variantRequired = variantRequired;
	}

	public boolean getAttributeDisplayOnly() {
		return variantDisplayOnly;
	}

	public void setAttributeDisplayOnly(boolean variantDisplayOnly) {
		this.variantDisplayOnly = variantDisplayOnly;
	}

	public boolean getAttributeDiscounted() {
		return variantDiscounted;
	}

	public void setAttributeDiscounted(boolean variantDiscounted) {
		this.variantDiscounted = variantDiscounted;
	}

	public ProductOption getProductOption() {
		return productOption;
	}

	public void setProductOption(ProductOption productOption) {
		this.productOption = productOption;
	}

	public ProductOptionValue getProductOptionValue() {
		return productOptionValue;
	}

	public void setProductOptionValue(ProductOptionValue productOptionValue) {
		this.productOptionValue = productOptionValue;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	public String getAttributeSortOrder() {
		return variantSortOrder;
	}

	public void setAttributeSortOrder(String variantSortOrder) {
		this.variantSortOrder = variantSortOrder;
	}

	public String getAttributeAdditionalWeight() {
		return variantAdditionalWeight;
	}

	public void setAttributeAdditionalWeight(String variantAdditionalWeight) {
		this.variantAdditionalWeight = variantAdditionalWeight;
	}
	
	public BigDecimal getProductAttributePrice() {
		return productAttributePrice;
	}

	public void setProductAttributePrice(BigDecimal productAttributePrice) {
		this.productAttributePrice = productAttributePrice;
	}



}
