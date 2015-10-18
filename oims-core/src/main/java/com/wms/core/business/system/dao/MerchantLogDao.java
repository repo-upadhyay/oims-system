package com.wms.core.business.system.dao;

import java.util.List;

import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.system.model.MerchantLog;

public interface MerchantLogDao extends SalesManagerEntityDao<Long, MerchantLog> {


	List<MerchantLog> listByMerchant(MerchantStore store);
	
}
