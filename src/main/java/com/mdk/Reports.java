package com.mdk;

import java.awt.Desktop;
import java.io.File;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static void main(String[] args) throws Exception {
		ExtentReports extentReports = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./Reports/Report.html"); // To specify the path for the report
		extentReports.attachReporter(sparkReporter);  // To specify the type of report
		
		extentReports.createTest("Test One");  // Normal Test by default it will be pass
		
		extentReports.createTest("Test Two" , "To verify the description"); // We can add description in the same method
		
		ExtentTest Test1 = extentReports.createTest("Test 1");
		Test1.pass("This is passed");
		
		ExtentTest Test2 = extentReports.createTest("Test 2");
		Test2.log(Status.FAIL, "This is failed");
		
		extentReports.createTest("Test 2").log(Status.SKIP,"This is skipped");
		
		extentReports.flush();  // To generate the report
		Desktop.getDesktop().browse(new File("Reports/Report.html").toURI()); // To open the file automatically
	}

}
