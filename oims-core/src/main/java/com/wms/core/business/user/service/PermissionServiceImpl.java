package com.wms.core.business.user.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.generic.service.SalesManagerEntityServiceImpl;
import com.wms.core.business.merchant.service.MerchantStoreService;
import com.wms.core.business.reference.language.service.LanguageService;
import com.wms.core.business.user.dao.PermissionDao;
import com.wms.core.business.user.model.Group;
import com.wms.core.business.user.model.Permission;
import com.wms.core.business.user.model.PermissionCriteria;
import com.wms.core.business.user.model.PermissionList;

@Service("permissionService")
public class PermissionServiceImpl extends
		SalesManagerEntityServiceImpl<Integer, Permission> implements
		PermissionService {

	PermissionDao permissionDao;

	@Autowired
	private LanguageService languageService;

	@Autowired
	private MerchantStoreService merchantService;
	
	@Autowired
	private GroupService groupService;

	@Autowired
	public PermissionServiceImpl(PermissionDao permissionDao) {
		super(permissionDao);
		this.permissionDao = permissionDao;

	}

	@Override
	public List<Permission> getByName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Permission getById(Integer permissionId) {
		return permissionDao.getById(permissionId);

	}

	@Override
	public void saveOrUpdate(Permission permission) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePermission(Permission permission) throws ServiceException {
		permission = this.getById(permission.getId());//Prevents detached entity error
		permission.setGroups(null);
		
		this.delete(permission);
	}
	

	@Override
	public List<Permission> getPermissions(List<Integer> groupIds)
			throws ServiceException {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Set ids = new HashSet(groupIds);
		return permissionDao.getPermissionsListByGroups(ids);
	}

	@Override
	public PermissionList listByCriteria(PermissionCriteria criteria)
			throws ServiceException {
		return permissionDao.listByCriteria(criteria);
	}

	@Override
	public void removePermission(Permission permission,Group group) throws ServiceException {
		permission = this.getById(permission.getId());//Prevents detached entity error
	
		permission.getGroups().remove(group);
		

	}

	@Override
	public List<Permission> listPermission() throws ServiceException {
		return permissionDao.listPermission();
	}


}
