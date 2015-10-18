package com.salesmanager.test.content;

import java.util.Date;









import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.salesmanager.test.core.AbstractSalesManagerCoreTestCase;
import com.wms.core.business.content.service.ContentService;
import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.reference.country.model.Country;
import com.wms.core.business.reference.language.model.Language;
import com.wms.core.business.reference.zone.model.Zone;





public class WebsiteContentTestCase extends AbstractSalesManagerCoreTestCase {
	
	private static final Date date = new Date(System.currentTimeMillis());
	
	@Autowired
	private ContentService contentService;
	
	@Test
	public void testCreateContentPage() throws ServiceException {
		
	    Language en = languageService.getByCode("en");
	    Country country = countryService.getByCode("CA");
	    Zone zone = zoneService.getByCode("QC");

	    MerchantStore store = merchantService.getByCode(MerchantStore.DEFAULT_STORE);
	    
	    

	}
	
	public void testCreateContentBox() throws ServiceException {
		
	    Language en = languageService.getByCode("en");
	    Country country = countryService.getByCode("CA");
	    Zone zone = zoneService.getByCode("QC");

	    MerchantStore store = merchantService.getByCode(MerchantStore.DEFAULT_STORE);
	    
	    

	}
	

}