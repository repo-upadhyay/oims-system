package com.wms.core.business.order.dao.orderproduct;

import java.util.List;

import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.order.model.orderproduct.OrderProductDownload;

public interface OrderProductDownloadDao extends SalesManagerEntityDao<Long, OrderProductDownload> {

	List<OrderProductDownload> getByOrderId(Long orderId);

}
