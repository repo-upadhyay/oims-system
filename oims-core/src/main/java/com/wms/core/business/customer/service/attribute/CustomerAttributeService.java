package com.wms.core.business.customer.service.attribute;

import java.util.List;

import com.wms.core.business.customer.model.Customer;
import com.wms.core.business.customer.model.attribute.CustomerAttribute;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.generic.service.SalesManagerEntityService;
import com.wms.core.business.merchant.model.MerchantStore;

public interface CustomerAttributeService extends
		SalesManagerEntityService<Long, CustomerAttribute> {

	void saveOrUpdate(CustomerAttribute customerAttribute)
			throws ServiceException;

	CustomerAttribute getByCustomerOptionId(MerchantStore store,
			Long customerId, Long id);

	List<CustomerAttribute> getByCustomerOptionValueId(MerchantStore store,
			Long id);

	List<CustomerAttribute> getByOptionId(MerchantStore store, Long id);


	List<CustomerAttribute> getByCustomer(MerchantStore store, Customer customer);
	

}
