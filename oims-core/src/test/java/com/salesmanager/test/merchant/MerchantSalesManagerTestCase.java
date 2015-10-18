package com.salesmanager.test.merchant;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.salesmanager.test.core.AbstractSalesManagerCoreTestCase;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.reference.country.model.Country;
import com.wms.core.business.reference.language.model.Language;

public class MerchantSalesManagerTestCase extends AbstractSalesManagerCoreTestCase {
	
	@Test
	public void createMerchant() throws Exception {
		Country country = countryService.getByCode("CA");
		Language lang = languageService.getByCode("en");
		List<Language> langs = languageService.list();
		
		//create a merchant
		MerchantStore store = new MerchantStore();
		store.setCountry(country);
		store.setCurrency(currencyService.getByCode("CAD"));
		store.setDefaultLanguage(lang);
		store.setInBusinessSince(new Date());
		store.setStorename("store name");
		store.setCode("STORE");
		store.setLanguages(langs);
		store.setStoreEmailAddress("test@test.com");

		merchantService.create(store);
		store = merchantService.getById(store.getId());
		Assert.assertTrue(store!=null);
		System.out.println(store.getId());
		System.out.println(store.getDomainName());
		System.out.println(store.getDefaultLanguage().getId());
		System.out.println(store.getLanguages().size());
	}
}
