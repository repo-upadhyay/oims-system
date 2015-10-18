package com.wms.core.business.user.dao;

import java.util.List;
import java.util.Set;

import com.wms.core.business.generic.dao.SalesManagerEntityDao;
import com.wms.core.business.user.model.Permission;
import com.wms.core.business.user.model.PermissionCriteria;
import com.wms.core.business.user.model.PermissionList;

public interface PermissionDao extends SalesManagerEntityDao<Integer, Permission> {

	List<Permission> listPermission();

	Permission getById(Integer permissionId);

	List<Permission> getPermissionsListByGroups(Set permissionIds);

	PermissionList listByCriteria(PermissionCriteria criteria);



}
