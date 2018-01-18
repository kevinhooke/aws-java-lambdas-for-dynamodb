package kh.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import kh.aws.lambda.domain.Page;
import kh.aws.lambda.domain.PageCount;
import pagecounts.PageCountsRepository;

public class IncrementPageCount implements RequestHandler<Page, PageCount> {
	
	public PageCount handleRequest(Page page, Context context) {
		LambdaLogger logger = context.getLogger();
		logger.log("IncrementPageCount called with pageId: " + page.getPageId().toString());
		
		PageCountsRepository pageCounts = new PageCountsRepository();
		Integer result = pageCounts.incrementPageCount(page.getPageId().intValue());
		logger.log("... result: " + result.toString());
		
		
		return new PageCount(result.intValue());
	}

}
