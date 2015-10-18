package com.wms.core.business.system.service;

import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.modules.email.Email;
import com.wms.core.modules.email.EmailConfig;


public interface EmailService {

	public void sendHtmlEmail(MerchantStore store, Email email) throws ServiceException, Exception;
	
	public EmailConfig getEmailConfiguration(MerchantStore store) throws ServiceException;
	
	public void saveEmailConfiguration(EmailConfig emailConfig, MerchantStore store) throws ServiceException;
	
}
