package kh.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import kh.aws.lambda.domain.Page;
import pagecounts.PageCountsRepository;

public class GetPageCount implements RequestHandler<Page, String> {
	
	public String handleRequest(Page page, Context context) {
		LambdaLogger logger = context.getLogger();
		logger.log("GetPageCount called with pageId: " + page.getPageId().toString());
		
		PageCountsRepository pageCounts = new PageCountsRepository();
		String result = pageCounts.getPageCount().toString();
		logger.log("... result: " + result);
		return result;
	}

}
