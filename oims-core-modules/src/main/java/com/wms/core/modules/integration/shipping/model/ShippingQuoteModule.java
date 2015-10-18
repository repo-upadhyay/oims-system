package com.wms.core.modules.integration.shipping.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;

import com.wms.core.business.common.model.Delivery;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.shipping.model.PackageDetails;
import com.wms.core.business.shipping.model.ShippingConfiguration;
import com.wms.core.business.shipping.model.ShippingOption;
import com.wms.core.business.system.model.CustomIntegrationConfiguration;
import com.wms.core.business.system.model.IntegrationConfiguration;
import com.wms.core.business.system.model.IntegrationModule;
import com.wms.core.modules.integration.IntegrationException;

public interface ShippingQuoteModule {
	
	public void validateModuleConfiguration(IntegrationConfiguration integrationConfiguration, MerchantStore store) throws IntegrationException;
	public CustomIntegrationConfiguration getCustomModuleConfiguration(MerchantStore store) throws IntegrationException;
	
	public List<ShippingOption> getShippingQuotes(List<PackageDetails> packages, BigDecimal orderTotal, Delivery delivery, MerchantStore store, IntegrationConfiguration configuration, IntegrationModule module, ShippingConfiguration shippingConfiguration, Locale locale) throws IntegrationException;

}
