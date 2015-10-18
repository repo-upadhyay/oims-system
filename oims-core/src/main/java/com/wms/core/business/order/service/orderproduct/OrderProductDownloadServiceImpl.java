package com.wms.core.business.order.service.orderproduct;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wms.core.business.customer.service.CustomerService;
import com.wms.core.business.generic.service.SalesManagerEntityServiceImpl;
import com.wms.core.business.order.dao.orderproduct.OrderProductDownloadDao;
import com.wms.core.business.order.model.orderproduct.OrderProductDownload;
import com.wms.core.business.payments.service.PaymentService;
import com.wms.core.business.payments.service.TransactionService;
import com.wms.core.business.shipping.service.ShippingService;
import com.wms.core.business.tax.service.TaxService;
import com.wms.core.modules.order.InvoiceModule;


@Service("orderProductDownloadService")
public class OrderProductDownloadServiceImpl  extends SalesManagerEntityServiceImpl<Long, OrderProductDownload> implements OrderProductDownloadService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderProductDownloadServiceImpl.class);

    @Autowired
    private InvoiceModule invoiceModule;

    @Autowired
    private ShippingService shippingService;
    
    @Autowired
    private PaymentService paymentService;

    @Autowired
    private TaxService taxService;
    
    @Autowired
    private CustomerService customerService;
    
    @Autowired
    private TransactionService transactionService;

    private final OrderProductDownloadDao orderProductDownloadDao;

    @Autowired
    public OrderProductDownloadServiceImpl(final OrderProductDownloadDao orderProductDownloadDao) {
        super(orderProductDownloadDao);
        this.orderProductDownloadDao = orderProductDownloadDao;
    }
    
    @Override
    public List<OrderProductDownload> getByOrderId(Long orderId) {
    	return orderProductDownloadDao.getByOrderId(orderId);
    }


}
