package com.wms.web.populator.order;

import com.wms.core.business.generic.exception.ConversionException;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.order.model.orderproduct.OrderProductDownload;
import com.wms.core.business.reference.language.model.Language;
import com.wms.core.utils.AbstractDataPopulator;
import com.wms.web.entity.order.ReadableOrderProductDownload;

public class ReadableOrderProductDownloadPopulator extends
		AbstractDataPopulator<OrderProductDownload, ReadableOrderProductDownload> {

	@Override
	public ReadableOrderProductDownload populate(OrderProductDownload source,
			ReadableOrderProductDownload target, MerchantStore store,
			Language language) throws ConversionException {
		try {
			
			target.setProductName(source.getOrderProduct().getProductName());
			target.setDownloadCount(source.getDownloadCount());
			target.setDownloadExpiryDays(source.getMaxdays());
			target.setId(source.getId());
			target.setFileName(source.getOrderProductFilename());
			target.setOrderId(source.getOrderProduct().getOrder().getId());
			
			return target;
			
		} catch(Exception e) {
			throw new ConversionException(e);
		}
	}

	@Override
	protected ReadableOrderProductDownload createTarget() {
		return new ReadableOrderProductDownload();
	}
	

}
