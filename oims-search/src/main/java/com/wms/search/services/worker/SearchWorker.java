package com.wms.search.services.worker;

import com.wms.search.services.SearchRequest;
import com.wms.search.services.SearchResponse;
import com.wms.search.utils.SearchClient;

public interface SearchWorker {
	
	public SearchResponse execute(SearchClient client, SearchRequest request, ExecutionContext context) throws Exception;

}
