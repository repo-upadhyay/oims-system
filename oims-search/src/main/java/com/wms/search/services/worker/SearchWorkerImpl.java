package com.wms.search.services.worker;

import javax.inject.Inject;

import com.wms.search.services.SearchRequest;
import com.wms.search.services.SearchResponse;
import com.wms.search.services.impl.SearchDelegate;
import com.wms.search.utils.SearchClient;


public class SearchWorkerImpl implements SearchWorker {
	
	@Inject
	private SearchDelegate searchDelegate;

	public SearchResponse execute(SearchClient client, SearchRequest request, ExecutionContext context) throws Exception{

		SearchResponse response = searchDelegate.search(request);

		response.setInputSearchJson(request.getJson());
		if(context == null) {
			context = new ExecutionContext();
		}
		context.setObject("response", response);
		return response;

	}

}
