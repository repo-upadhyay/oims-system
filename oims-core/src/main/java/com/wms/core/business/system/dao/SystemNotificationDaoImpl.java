package com.wms.core.business.system.dao;

import org.springframework.stereotype.Repository;

import com.wms.core.business.generic.dao.SalesManagerEntityDaoImpl;
import com.wms.core.business.system.model.SystemNotification;

@Repository("systemNotificationDao")
public class SystemNotificationDaoImpl extends SalesManagerEntityDaoImpl<Long, SystemNotification>
		implements SystemNotificationDao {



}
