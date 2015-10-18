package com.wms.search.services.worker;

import com.wms.search.services.SearchResponse;
import com.wms.search.utils.SearchClient;

public interface KeywordSearchWorker {
	
	public SearchResponse execute(SearchClient client,String collection,String json,int size, ExecutionContext context) throws Exception;

}
