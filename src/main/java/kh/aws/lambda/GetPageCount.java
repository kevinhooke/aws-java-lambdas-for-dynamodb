package kh.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import pagecounts.PageCountsRepository;

public class GetPageCount implements RequestHandler<String, String> {
	
	
	
	public String handleRequest(String name, Context context) {
		LambdaLogger logger = context.getLogger();
		logger.log("GetPageCount called...");
		
		PageCountsRepository pageCounts = new PageCountsRepository();
		String result = pageCounts.getPageCount().toString();
		logger.log("... result: " + result);
		return result;
	}

}
