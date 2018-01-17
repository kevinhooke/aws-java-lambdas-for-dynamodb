package kh.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorld implements RequestHandler<String, String> {
	
	public String handleRequest(String name, Context context) {
		return "Hello " + name + " from lambda!";
	}

}
