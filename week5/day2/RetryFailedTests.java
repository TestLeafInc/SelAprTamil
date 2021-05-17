package week5.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer{

	int maxRetry = 2, iCount = 0;
	
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && iCount < maxRetry) {
			iCount++;
			return true;
		}
		
		return false;
	}

}
