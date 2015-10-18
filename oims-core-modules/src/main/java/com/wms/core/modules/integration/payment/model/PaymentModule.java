package com.wms.core.modules.integration.payment.model;

import java.math.BigDecimal;
import java.util.List;

import com.wms.core.business.customer.model.Customer;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.order.model.Order;
import com.wms.core.business.payments.model.Payment;
import com.wms.core.business.payments.model.Transaction;
import com.wms.core.business.shoppingcart.model.ShoppingCartItem;
import com.wms.core.business.system.model.IntegrationConfiguration;
import com.wms.core.business.system.model.IntegrationModule;
import com.wms.core.modules.integration.IntegrationException;

public interface PaymentModule {
	
	public void validateModuleConfiguration(IntegrationConfiguration integrationConfiguration, MerchantStore store) throws IntegrationException;
	
	/**
	 * Returns token-value related to the initialization of the transaction This
	 * method is invoked for paypal express checkout
	 * @param customer
	 * @param order
	 * @return
	 * @throws IntegrationException
	 */
	public Transaction initTransaction(
			MerchantStore store, Customer customer, BigDecimal amount, Payment payment, IntegrationConfiguration configuration, IntegrationModule module)
			throws IntegrationException;
	
	public Transaction authorize(
			MerchantStore store, Customer customer, List<ShoppingCartItem> items, BigDecimal amount, Payment payment, IntegrationConfiguration configuration, IntegrationModule module)
			throws IntegrationException;

	
	public Transaction capture(
			MerchantStore store, Customer customer, Order order, Transaction capturableTransaction, IntegrationConfiguration configuration, IntegrationModule module)
			throws IntegrationException;
	
	public Transaction authorizeAndCapture(
			MerchantStore store, Customer customer, List<ShoppingCartItem> items, BigDecimal amount, Payment payment, IntegrationConfiguration configuration, IntegrationModule module)
			throws IntegrationException;
	
	public Transaction refund(
			boolean partial, MerchantStore store, Transaction transaction, Order order, BigDecimal amount, IntegrationConfiguration configuration, IntegrationModule module)
			throws IntegrationException;

}
