package com.salesmanager.test.email;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.salesmanager.test.core.AbstractSalesManagerCoreTestCase;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.modules.email.Email;

public class EmailTestCase extends AbstractSalesManagerCoreTestCase {

	@Test
	public void sendHtmlEmail() throws Exception {
		
		Map<String, String> templateTokens = new HashMap<String, String>();
		templateTokens.put("EMAIL_NEW_USER_TEXT", "Hi My Friend,");
		templateTokens.put("EMAIL_STORE_NAME", "oims Store");
		templateTokens.put("EMAIL_ADMIN_LABEL", "Adminstrator:");
		templateTokens.put("EMAIL_TEXT_NEW_USER_CREATED", "New user created");
		templateTokens.put("EMAIL_CUSTOMER_FIRSTNAME", "The");
		templateTokens.put("EMAIL_CUSTOMER_LAST", "Rock");
		templateTokens.put("EMAIL_ADMIN_USERNAME_LABEL", "UserName:");
		templateTokens.put("EMAIL_ADMIN_NAME", "Admin");
		templateTokens.put("EMAIL_ADMIN_PASSWORD_LABEL", "Password:");
		templateTokens.put("EMAIL_ADMIN_PASSWORD", "12345");
		templateTokens.put("EMAIL_ADMIN_URL_LABEL", "URL:");
		templateTokens.put("EMAIL_ADMIN_URL", "http://www.oims.com");
		templateTokens.put("EMAIL_FOOTER_COPYRIGHT", "Copyright @ oims 2013, All Rights Reserved!");
		templateTokens.put("EMAIL_DISCLAIMER", "Disclaimer text goes here...");
		templateTokens.put("EMAIL_SPAM_DISCLAIMER", "Spam Disclaimer text goes here...");
		
		
		Email email = new Email();
		email.setFrom("oims");
		email.setFromEmail("admin@oims.com");
		email.setSubject("HTML Test Mail");
		email.setTo("carl@csticonsulting.com");
		email.setTemplateName("email_template_new_user.ftl");
		email.setTemplateTokens(templateTokens);
		
		MerchantStore store = merchantService.getById(1);

		emailService.sendHtmlEmail(store, email);
	}
}
