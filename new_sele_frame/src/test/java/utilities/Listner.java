package utilities;

import base.Basetest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Listner implements ITestListener {


    ExtentSparkReporter html;
    ExtentReports reports;
    ExtentTest test;

    Basetest basetest;


    public void generateReport() {

        String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
        String repName = "Swaglabs" + timestamp + ".html";//name of report
        html = new ExtentSparkReporter("C:\\Users\\NTS-ShubhamJawale\\IdeaProjects\\new_sele_frame\\src\\main\\resources\\reports" + repName); //dynamic path
        reports = new ExtentReports();

        reports.attachReporter(html);

        reports.setSystemInfo("Machine", "Dell");
        reports.setSystemInfo("OS", "Windows10");


        html.config().setTheme(Theme.DARK);
        html.config().setReportName("SwagLabs Reports");
        html.config().setDocumentTitle("Report of SwagLabs ");

    }


    public void onTestStart(ITestResult result) {
        System.out.println("In Listener Start" + result.getName());


    }


    public void onTestSuccess(ITestResult result) {
// CMD PRINT
        System.out.println("In Listener TestSuccess" + result.getName());


// REPORT PRINT
        test = reports.createTest(result.getName());
        test.log(Status.PASS, MarkupHelper.createLabel("Name of Pass test Method " + result.getName(), ExtentColor.GREEN));
    }

    public void onTestFailure(ITestResult result) {
// REPORT PRINT
        test = reports.createTest(result.getName());
        test.log(Status.FAIL, MarkupHelper.createLabel("Name of Pass test Method " + result.getName(), ExtentColor.RED));
        // screenshot
        basetest = new Basetest();

        try {

            basetest.CaptureScreenshot(Basetest.driver, result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void onTestSkipped(ITestResult result) {
        test = reports.createTest(result.getName());
        test.log(Status.SKIP, MarkupHelper.createLabel("Name of Pass test Method " + result.getName(), ExtentColor.PINK));
    }


    public void onStart(ITestContext context) {
        generateReport();
    }

    public void onFinish(ITestContext context) {
        reports.flush();
    }
}


