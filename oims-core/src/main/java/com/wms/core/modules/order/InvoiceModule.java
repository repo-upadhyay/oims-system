package com.wms.core.modules.order;

import java.io.ByteArrayOutputStream;

import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.order.model.Order;
import com.wms.core.business.reference.language.model.Language;

public interface InvoiceModule {
	
	public ByteArrayOutputStream createInvoice(MerchantStore store, Order order, Language language) throws Exception;

}
