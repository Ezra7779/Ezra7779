package org.kyro;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class KYRO_Inspection {

	@Test
	public void tc1() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			// Launching the website
		driver.get("https://kyro.pages.dev/");
		
		//Login into KYRO

		WebElement element = driver.findElement(By.xpath("//button[@class='LoginButton_login_button__ehTMa']"));
		element.click();

		 Assert.assertEquals("Welcome", "Welcome");
		 System.out.println("Successfully passed");

		WebElement emailAddrs = driver.findElement(By.xpath("//input[@class='input cadd5d405 c97a9152a']"));
		emailAddrs.sendKeys("ezra.sastry.musali@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@class='input cadd5d405 c5dfe92ac']"));
		password.sendKeys("Ezrasastry@9");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		 Assert.assertEquals("Welcome", "Welcome");
		 System.out.println("Successfully passed");


		Thread.sleep(3000);
		
		// Navigating to Dashboard Button
		

		 driver.findElement(By.xpath("(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1xemp2x'])[3]")).click();

		// Navigating to NewProject Button in Dashboard Page

		Thread.sleep(5000);

		WebElement newproject = driver.findElement(By.xpath("//a[@href='/Addproject']"));
		newproject.click();

		Thread.sleep(5000);
		//Fields are filling accordingly

		WebElement startdate = driver.findElement(By.xpath("//input[@id=':r1:']"));
		startdate.click();
		startdate.sendKeys("09/06/2022");

		WebElement enddate = driver.findElement(By.xpath("//input[@id=':r2:']"));
		enddate.click();
		enddate.sendKeys("09/07/2022");

		WebElement project = driver.findElement(By.xpath("//input[@name='projectname']"));
		project.sendKeys("construction");

		driver.findElement(By.xpath("//div[@role='button']")).click();

		driver.findElement(By.xpath("//li[@tabindex='0']")).click();

		WebElement owner = driver.findElement(By.xpath("//input[@id=':r5:']"));
		owner.click();
		owner.sendKeys("EZRA");


		driver.findElement(By.xpath("//div[@id=':r6:']")).click();

		driver.findElement(By.xpath("//li[@data-value='3']")).click();

		driver.findElement(By.xpath("//div[@id=':r7:']")).click();

		driver.findElement(By.xpath("//li[@data-value='C']")).click();

		WebElement cost = driver.findElement(By.xpath("//input[@id=':r8:']"));
		cost.click();
		cost.sendKeys("3 crores");

		WebElement poc = driver.findElement(By.xpath("//input[@id=':r9:']"));
		poc.click();
		poc.sendKeys("good experience");

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		Thread.sleep(3000);

		WebElement kyro = driver.findElement(By.xpath("//div[@class='viewproject_viewprojects_hero__UOPlF']"));

		// method for taking screenshot
		File s = kyro.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\Hi.ANISH\\eclipse-workspace\\Kyro\\src\\screenshot\\Dashboardview.png");
		FileUtils.copyFile(s, d);

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[text()='View All'])[1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@texttransform='none']")).click();

		Thread.sleep(3000);

		WebElement summary = driver.findElement(By.xpath("//input[@name='summary']"));
		summary.click();
		summary.sendKeys("good experience");

		WebElement tasktype = driver.findElement(By.xpath("//input[@name='task_type']"));
		tasktype.click();
		tasktype.sendKeys("civil construction type");

		WebElement despt = driver.findElement(By.xpath("//input[@name='description']"));
		despt.click();
		despt.sendKeys("It's a MEGA project");

		driver.findElement(By.xpath(
				"//div[@class='MuiSelect-select MuiSelect-outlined MuiOutlinedInput-input MuiInputBase-input css-qiwgdb']"))
				.click();

		driver.findElement(By.xpath("//li[@data-value='3']")).click();

		WebElement location = driver.findElement(By.xpath("//input[@name='location']"));
		location.click();
		location.sendKeys("Chennai");

		WebElement startdate1 = driver.findElement(By.xpath("//input[@name='start_date']"));
		startdate1.click();
		startdate1.sendKeys("09/06/2022");

		WebElement enddate1 = driver.findElement(By.xpath("//input[@name='due_date']"));
		enddate1.click();
		enddate1.sendKeys("09/07/2022");

		driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root  css-7yz33c')]")).click();

		Thread.sleep(3000);

		WebElement prjtview = driver
				.findElement(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0\"]"));

		File s1 = prjtview.getScreenshotAs(OutputType.FILE);
		File d1 = new File("C:\\Users\\Hi.ANISH\\eclipse-workspace\\Kyro\\src\\screenshot\\projectview.png");
		FileUtils.copyFile(s1, d1);

		driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root  css-1w8rgmy')]")).click();

		WebElement taskview = driver.findElement(By.xpath("//div[contains(@class,'MuiGrid-grid-xs-12 css-15j76c0')]"));

		File s2 = taskview.getScreenshotAs(OutputType.FILE);
		File d2 = new File("C:\\Users\\Hi.ANISH\\eclipse-workspace\\Kyro\\src\\screenshot\\taskview.png");
		FileUtils.copyFile(s2, d2);

		WebElement dashbutton1 = driver.findElement(By.xpath("(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1xemp2x'])[3]"));
		dashbutton1.click();

		driver.findElement(By.xpath("//button[contains(@class,'MuiIconButton-sizeSmall css-ls7mz4')]")).click();

		driver.findElement(By.xpath("(//li[contains(@class,'MuiButtonBase-root css-he7uux')])[1]")).click();
		
		Thread.sleep(3000);

		WebElement profile = driver.findElement(By.xpath("//div[contains(@class,'MuiGrid-spacing-xs-3 css-bs9r3d')]"));

		File s3 = profile.getScreenshotAs(OutputType.FILE);
		File d3 = new File("C:\\Users\\Hi.ANISH\\eclipse-workspace\\Kyro\\src\\screenshot\\profileview.png");
		FileUtils.copyFile(s3, d3);
		
		WebElement dashbutton2 = driver.findElement(By.xpath("(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1xemp2x'])[3]"));
		dashbutton2.click();
		
		driver.findElement(By.xpath("//button[contains(@class,'MuiIconButton-sizeSmall css-ls7mz4')]")).click();



		driver.findElement(By.xpath("(//li[contains(@class,'MuiButtonBase-root css-he7uux')])[2]")).click();
		

	}
}