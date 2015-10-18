package com.wms.web.utils;

import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.web.shop.controller.ControllerConstants;

public class PageBuilderUtils {
	
	public static String build404(MerchantStore store) {
		return new StringBuilder().append(ControllerConstants.Tiles.Pages.notFound).append(".").append(store.getStoreTemplate()).toString();
	}

}
