package com.logigear.testng;

import org.testng.ITestResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QTiumVerificationFailures extends HashMap<ITestResult, List<Throwable>>
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static QTiumVerificationFailures getFailures()
    {
        if ( failures == null ) {
            failures = new QTiumVerificationFailures();
        }
        return failures;
    }
    
    public List<Throwable> getFailuresForTest(ITestResult result)
    {
        List<Throwable> exceptions = get(result);
        return exceptions == null ? new ArrayList<Throwable>() : exceptions;
    }
   
    public void addFailureForTest(ITestResult result, Throwable throwable)
    {
        List<Throwable> exceptions = getFailuresForTest(result);
        exceptions.add(throwable);
        put(result, exceptions);
    }
    
    private QTiumVerificationFailures() { super(); }
    
    private static QTiumVerificationFailures failures;
}
