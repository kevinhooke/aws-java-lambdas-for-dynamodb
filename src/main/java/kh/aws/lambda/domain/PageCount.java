package kh.aws.lambda.domain;

public class PageCount {

	private int count;

	public PageCount() {
	}
	
	public PageCount(int value) {
		this.count = value;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
