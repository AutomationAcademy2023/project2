package Utils.Listeners;

import Utils.Annotations.MaxNumberOfRetries;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int counter = 0;
    @Override
    public boolean retry(ITestResult result) {
        MaxNumberOfRetries annotation = result.getMethod().getConstructorOrMethod().getMethod()
                .getAnnotation(MaxNumberOfRetries.class);
        if((annotation != null) && (counter < annotation.value())) {
            counter++;
            return true;
        }
        return false;
    }
}