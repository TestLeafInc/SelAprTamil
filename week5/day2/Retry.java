package week5.day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class Retry implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, 
							Class testClass, 
							Constructor testConstructor,
							Method testMethod) {
		annotation.setRetryAnalyzer(RetryFailedTests.class);

	}


}
