package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_Report {
	static ExtentReports extentReport;
	public static ExtentReports getExtent_Report()
	{
		String extentReportpath=System.getProperty("user.dir"+"\\Report\\extentReport.html");
		
		 ExtentSparkReporter spark = new ExtentSparkReporter("ExtentSparkReporter");
		 spark.config().setReportName("Testing_April_Batch");
		 spark.config().setDocumentTitle("TestResult");
		 extentReport=new ExtentReports();
		 extentReport.attachReporter(spark);
	      //extentReport.attachReporter(reporter);
	      extentReport.setSystemInfo("operatingSystem", "Window10");
	      extentReport.setSystemInfo("tested by", "QA");
return extentReport;
		
	}
	

}
