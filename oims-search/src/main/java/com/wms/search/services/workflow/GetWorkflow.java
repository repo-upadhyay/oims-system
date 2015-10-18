package com.wms.search.services.workflow;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.wms.search.services.impl.SearchDelegate;



@Component
public class GetWorkflow extends Workflow {
	
	@Inject
	private SearchDelegate searchDelegate;
	public com.wms.search.services.GetResponse getObject(String collection, String object, String id) throws Exception {

		return searchDelegate.getObject(collection, object, id);
		
	}

}
