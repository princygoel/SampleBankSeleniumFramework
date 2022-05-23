package com.inetbanking.testCases;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//import com.avenstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        ExtentTest test = extent.createTest("Myfirst", "sample");
        
     // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
        // calling flush writes everything to the log file
        extent.flush();
	}

}
