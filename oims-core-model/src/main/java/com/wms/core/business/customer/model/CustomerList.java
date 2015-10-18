package com.wms.core.business.customer.model;

import java.util.List;

import com.wms.core.business.customer.model.Customer;
import com.wms.core.business.common.model.EntityList;

public class CustomerList extends EntityList {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3108842276158069739L;
	private List<Customer> customers;
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public List<Customer> getCustomers() {
		return customers;
	}

}
