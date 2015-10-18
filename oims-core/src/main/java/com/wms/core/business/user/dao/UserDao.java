package com.wms.core.business.user.dao;

import java.util.List;

import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.merchant.model.MerchantStore;
import com.wms.core.business.user.model.User;

public interface UserDao extends SalesManagerEntityDao<Long, User> {

	User getByUserName(String userName);

	List<User> listUser();

	List<User> listUserByStore(MerchantStore store);



}
