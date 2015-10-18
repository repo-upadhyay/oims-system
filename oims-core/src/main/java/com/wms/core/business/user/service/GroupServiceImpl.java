package com.wms.core.business.user.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wms.core.business.generic.exception.ServiceException;
import com.wms.core.business.generic.service.SalesManagerEntityServiceImpl;
import com.wms.core.business.user.dao.GroupDao;
import com.wms.core.business.user.model.Group;
import com.wms.core.business.user.model.GroupType;

@Service("groupService")
public class GroupServiceImpl extends
		SalesManagerEntityServiceImpl<Integer, Group> implements GroupService {

	GroupDao groupDao;


	@Autowired
	public GroupServiceImpl(GroupDao groupDao) {
		super(groupDao);
		this.groupDao = groupDao;

	}






	@Override
	public List<Group> listGroup(GroupType groupType) throws ServiceException {
		try {
			return groupDao.listGroup(groupType);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}
	
	public List<Group> listGroupByIds(Set<Integer> ids) throws ServiceException {
		try {
			return groupDao.listGroupByIds(ids);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}


}
