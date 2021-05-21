package GenericFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;


public class Ex1<WebElement> {
	
	UtilityFunctions utils = new UtilityFunctions();
	
	//@Test
	public void Test() throws Exception
	{
		//Open Chrome browser
		utils.SetupWebDriver("Chrome");
		
		//Wait
		utils.WaitTime(2);
		
		//Navigate to URL
		utils.NavigateToURL("http://demo.guru99.com/test/newtours/");
		
		//Wait
		utils.WaitTime(2);
		
		//Expected Title
		String sExpectedTitle = "Welcome: Mercury Tours";
		
		//Actual Title
		String sActualTitle = utils.getWebdriver().getTitle();
		
		//Compare
		if(sActualTitle.equals(sExpectedTitle))
		{
			//Print to Console
			System.out.println("Title Matches, Test Passed");
		}
		else
		{
			//Print to Console
			System.out.println("Title does not match, Test Failed");
		}
		
		//Close Chrome Browser		
		utils.CloseBrowser();
	}
	
	//@Test
	public void Test_1() throws Exception
	{
		//Open Chrome browser
		utils.SetupWebDriver("Chrome");
		
		//Wait
		utils.WaitTime(2);
		
		//Navigate to URL
		utils.NavigateToURL("https://demoqa.com/automation-practice-form");
		
		//Wait
		utils.WaitTime(2);
		
		//Enter the First Name
		//utils.getWebdriver().findElement(By.id("firstName")).sendKeys("Mpumi");
		utils.EnterText("ID", "firstName","Mpumi");
		
		//Enter the Last Name
		utils.getWebdriver().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ntuli");
		utils.EnterText("xpath","//input[@placeholder='Last Name']", "Ntuli"); 

		//Wait
		utils.WaitTime(2);
		
		//Click Button
		utils.getWebdriver().findElement(By.id("submit")).click();
		
		//Close Chrome Browser		
		utils.CloseBrowser();
		
	}
	
	//@Test
	public void Test_2() throws Exception
	{
		//Open Chrome browser
		utils.SetupWebDriver("Chrome");
		
		//Wait
		utils.WaitTime(2);
		
		//Navigate to URL
		utils.NavigateToURL("https://demoqa.com/automation-practice-form");
		
		//Wait
		utils.WaitTime(2);
		
		//Page down
		utils.PageDown();
		
		//Wait
		utils.WaitTime(2);
		
		//Click on Book Store Application
		utils.getWebdriver().findElement(By.xpath("//*[text()='Book Store Application']")).click();

		//Wait
		utils.WaitTime(2);	
		
		//Click on Book Store
		utils.getWebdriver().findElement(By.xpath("//*[text()='Book Store']")).click();

		//Wait
		utils.WaitTime(2);	
		
		//Click on the First book using Partial Link Text
		utils.getWebdriver().findElement(By.partialLinkText("Git")).click();

		//Wait
		utils.WaitTime(2);	
		
		//Back to Book Store
		utils.getWebdriver().findElement(By.id("addNewRecordButton")).click();

		//Wait
		utils.WaitTime(2);	
		
		//Click on another book using Link Text
		utils.getWebdriver().findElement(By.linkText("Learning JavaScript Design Patterns")).click();

		//Wait
		utils.WaitTime(2);	
		
		//Close Chrome Browser		
		utils.CloseBrowser();
	 }

     //@Test
  	  public void Test_3() throws Exception
  	  {
		//Open Chrome browser
  		utils.SetupWebDriver("Chrome");
		
		//Wait
		utils.WaitTime(2);
		
		//Navigate to URL
		utils.NavigateToURL("http://demo.automationtesting.in/Register.html");
		
		//Wait
		utils.WaitTime(2);
		
		//Enter First Name
		utils.EnterText("xpath","//input[@placeholder='First Name']", "Mpumi");
		
		//Enter Last Name
		utils.EnterText("xpath","//input[@placeholder='Last Name']", "Ntuli");
		
		//Enter Address
		utils.EnterText("xpath", "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea", "Test");
		
		//Enter Email address
		utils.EnterText("xpath","//input[@placeholder='email']", "test@gmail.com"); 
		
		//Enter Phone Number
		utils.EnterText("xpath","//input[@placeholder='tel']", "073716458"); 
		
		//Select Gender
		//utils.ClickObject("xpath", "//input[@type='radio' and @value='Male']");
		utils.MultiSelect("Radio", "Male");
				
		//Select Hobbies
		//utils.ClickObject("xpath", "//input[@type='checkbox' and @value='Movies']");
		 utils.MultiSelect("checkbox", "Movies");
				
		//Select Language/s
		utils.ClickObject("xpath", "//*[@id=\"msdd\"]");
		utils.WaitTime(1);
		utils.ClickObject("xpath","//*[@id=\\\"js-product-list-top\\\"]/div/div[2]/div/div/div/div/a[4]/a");

		//Select Skills
		utils.SelectDropDownVisibleText("id", "Skills", "Adobe InDesign");
				
		//Select Country
		utils.SelectDropDownVisibleText("id", "countries", "South Africa");
				
		//Select D.O.B Year
		utils.SelectDropDownVisibleText("id", "yearbox", "2000");
				
		//Select D.O.B Month
		utils.SelectDropDownVisibleText("xpath", "//*[@placeholder='Month']", "May");
				
		//Select D.O.B Day
		utils.SelectDropDownVisibleText("id", "daybox", "1");
				
		//Enter Password
		utils.EnterText("id", "firstpassword", "Test123");
				
		//Confirm Password
		utils.EnterText("id", "secondpassword", "Test123");
				
		//Upload Document - *Not required Bonus*
		utils.FileUpload(/Users/mpumintuli/eclipse-workspace/Maven-Project/ExtentLogFail20210311_163128.png);
				
		//Wait
		utils.WaitTime(2);	
		
		//Close Chrome Browser		
		utils.CloseBrowser();
			}
      //@Test
  	  public void Test_4() throws Exception
  	  {
    	  
    	//Open Chrome browser
  		utils.SetupWebDriver("Chrome");
  		
  		//Wait
  		utils.WaitTime(2);
  		
  		//Navigate to URL
  		utils.NavigateToURL("http://demo.guru99.com/test/newtours/register.php");
  		
  		//Wait
  		utils.WaitTime(2);
  		
  	     //Enter First Name
  		utils.EnterText("xpath","//*[Contains(text(),'First')]/following:: input[1]", "Mpumi");
  		
  	    //Enter Last Name
  		utils.EnterText("xpath","//*[Contains(text(),'Last')]/following:: input[1]", "Ntuli");
  		
     	//Enter Phone Number
  		utils.EnterText("xpath","//*[Contains(text(),'Phone')]/following:: input[1]", "0737153438");
     
     	
     	//Enter Email address
  		utils.EnterText("xpath","//*[Contains(text(),'Email')]/following:: input[1]", "mpumi.ntuli@gmail.com");
     	
     	//Scroll
     	utils.PageDown();
     	
     	//Enter Address
     	utils.EnterText("xpath","//*[Contains(text(),'Address')]/following:: input[1]", "Test Street");
     	
     	//Enter City
     	utils.EnterText("xpath","//*[Contains(text(),'City')]/following:: input[1]", "Cape Town");
     	
     	//Enter Province
     	utils.EnterText("xpath","//*[Contains(text(),'State/Province')]/following:: input[1]", "Western Cape");
     	
    	//Enter Postal Code
     	utils.SelectDropDownVisibleText("xpath","//*[Contains(text(),'Country')]/following:: input[1]", "SOUTH AFRICA");
     	
    	//Scroll
     	utils.PageDown();

     	//Enter Postal Code
     	utils.SelectDropDownVisibleText("xpath","//*[Contains(text(),'Country')]/following:: select[1]", "SOUTH AFRICA");
     	
     	//Enter Username 
     	utils.EnterText("xpath","//*[Contains(text(),'User')]/following:: input[1]", "Mpumi");
     	
     	//Enter Password
     	utils.EnterText("xpath","//*[Contains(text(),'Password')]/following:: input[1]", "123");
     	
     	//Confirm Password
     	utils.EnterText("xpath","//*[Contains(text(),'Confirm')]/following:: input[1]", "123");
     	
     	//Click Submit
        utils.ClickObject("xpath", "//"['@type' = 'submit']");
    
     	//Wait
     	utils.WaitTime(2);	
     			
     	//Close Chrome Browser		
     	utils.CloseBrowser();
  	  }
  	//@Test
  	public void Test_5() throws Exception
  	{
  		//Open Chrome browser
  		utils.SetupWebDriver("Chrome");
  		
  		//Wait
  		utils.WaitTime(2);
  		
  		//Navigate to URL
  		utils.NavigateToURL("https://demoqa.com/automation-practice-form");
  		
  		//Enter First Name
  		utils.EnterText("xpath", "//*[contains(text(),'Name')]/following::input[1]", "Mpumi");
  		
  		//Enter Last Name
  		utils.EnterText("xpath", "//*[contains(text(),'Name')]/following::input[2]", "Ntuli");
  		
  		//Enter Email Address
  		utils.EnterText("xpath", "//*[contains(text(),'Email')]/following::input[1]", "Mpumi@test.com");
  		
  		String sGender = "Male";
  		
  		//Select Gender
  		utils.ClickObject("xpath", "//*[contains(text(),'"+ sGender+"')]");
  		
  		//Enter Mobile
  		utils.EnterText("xpath", "//*[contains(text(),'Mobile')]/following::input[1]", "0737153438");
  		
  		//Enter Date of Birth
  		utils.EnterText("xpath", "//*[contains(text(),'Date of Birth')]/following::input[1]", "07 May 2021");
  		
  		//Enter Subjects
  		utils.EnterText("xpath", "//*[contains(text(),'Subjects')]/following::input[1]", "English");
  		
  	    //Wait
  		utils.WaitTime(2);
  	
  		String sEnglish = "English";
  	     
  		//Enter Subjects
  	     utils.EnterText("xpath", "//*[contains(text(),'Subjects')]/following::input[1]", "English");
  	   utils.getWebdriver().findElement(By.xpath("//*[contains(text(),'State and City')]/following::input[1]")).sendKeys(Keys.ENTER);
  	
  		String sHobbies = "Sports";
  		
  		//Select Gender
  		utils.ClickObject("xpath", "//*[contains(text(),'"+ sHobbies+"')]");
  		
  		//Upload Document - *Not required Bonus*
  		utils.FileUpload("‪//Users//mpumintuli//Eclipse-workspace//Maven-Project//screenshots//ExtentLogPass20210401_131149.png");

  		//Scroll
  		utils.PageDown();
  		
  		//Enter Address
  		utils.EnterText("xpath", "//*[contains(text(),'Address')]/following::textarea[1]", "123 Street");
  		
  		//Enter State and City
  		utils.EnterText("xpath", "//*[contains(text(),'State and City')]/following::input[1]", "NCR");
  		utils.getWebdriver().findElement(By.xpath("//*[contains(text(),'State and City')]/following::input[1]")).sendKeys(Keys.ENTER);
  		
  		//Wait
  		utils.WaitTime(2);
  	}
  	
  }