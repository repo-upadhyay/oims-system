package com.wms.core.business.order.service.orderproduct;

import java.util.List;

import com.wms.core.business.generic.service.SalesManagerEntityService;
import com.wms.core.business.order.model.orderproduct.OrderProductDownload;

public interface OrderProductDownloadService extends SalesManagerEntityService<Long, OrderProductDownload> {

	/**
	 * List {@link OrderProductDownload} by order id
	 * @param orderId
	 * @return
	 */
	List<OrderProductDownload> getByOrderId(Long orderId);

}
