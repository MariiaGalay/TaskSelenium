package com.epam.lab.util;

import org.apache.log4j.Logger;
import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.List;

public class TestNGListener  implements ITestListener, IReporter {

    private static final Logger LOG = Logger.getLogger(TestNGListener.class);

    @Override
    public void onTestStart(ITestResult result) {

        Reporter.log("Test start" + result.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("Congratulation test is successful" + result.getTestName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Reporter.log("Smth went wrong :(" + result.getTestName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        LOG.info("Start!!!" + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        LOG.info("Finish!" + context.getName());
    }

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

    }
}