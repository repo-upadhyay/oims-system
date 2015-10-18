package com.wms.core.business.tax.model;

import com.wms.core.business.common.model.OrderTotalItem;
import com.wms.core.business.tax.model.taxrate.TaxRate;

public class TaxItem extends OrderTotalItem {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String label;
	private TaxRate taxRate=null;

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setTaxRate(TaxRate taxRate) {
		this.taxRate = taxRate;
	}

	public TaxRate getTaxRate() {
		return taxRate;
	}


}
