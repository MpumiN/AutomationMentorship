package GenericFunctions;

//TestNG

import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


//Excel
	import org.apache.poi.ss.usermodel.*;
     import org.openqa.selenium.By;

	public class SeleniumAssessment {
		
		private static final SeleniumAssessment SeleniumAssement = null;
		public int iRow;
		public Sheet sheet;
		public String sRun;
		public String timeStamp;
		
		UtilityFunctions utils = new UtilityFunctions();
		FunctionLibrary funcLib = new FunctionLibrary();
		DataFunctions data = new DataFunctions();
		Reporting repo = new Reporting();
	
		private static Row getRow(int x) {
			// TODO Auto-generated method stub
			return null;
		}

		//@Test
		public void Test() throws Exception
		
		{
	       //Open Chrome browser
			utils.SetupWebDriver("Chrome");
			
			//Wait
			utils.WaitTime(2);
			
			//Navigate to URL
			utils.NavigateToURL("https://www.geewiz.co.za/");
			
			//Wait
			utils.WaitTime(2);
			
			//Search for Solar
			utils.EnterText("xpath","//input[@placeholder='Search our catalogue']", "Solar"); 
			
			//Wait
	     	utils.WaitTime(2);	
			
			//Click on Magnifying glass to search
			utils.ClickObject("xpath", "//*[@type='submit']");
			
			//Wait
	     	utils.WaitTime(2);		
			
	     	//Click on dropdown list 
	     	utils.ClickObject("xpath", "//*[@id=\"js-product-list-top\"]/div/div[2]/div/div/div");
	     	utils.WaitTime(2);
			//Select from Dropdown Sort by list
	     	utils.ClickObject("xpath", "//*[@id=\"js-product-list-top\"]/div/div[2]/div/div/div/div/a[4]");
	     	
		    //Wait
		    utils.WaitTime(1);
		 
			//Click on First Item
		    utils.ClickObject("xpath", "//*[@id=\"js-product-list\"]/div/div/div/div[1]/article/div/div[1]/a/span");
		    
			//Wait
	     	utils.WaitTime(1);
			
	     	//Click on First Result
			utils.ClickObject("xpath","//*[@id=\"js-product-list\"]/div/div/div/div[1]/article/div/div[2]/h3");
				
			//Enter Quantity Greater than 15
	     	utils.EnterText("id", "quantity_wanted", "1");  
	     	
	     	//Wait
	     	utils.WaitTime(2);
		
	     	//Add to Cart 
	     	utils.ClickObject("xpath", "//*[@type='submit']");
	     	
			//Handle Low Stock pop-up and click   	
	         utils.ClickObject("xpath", "//*[@id=\"product_confirmation_modal\"]/div[2]/button[1]");
	         
	         //Click Proceed to checkout 
	         utils.ClickObject("xpath" ,"//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");
	         
		}
	         //Validate that cart amount is greater than R10,000 
	         //findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[2]/span[2]]")) >= R35,328.96);
	         
	     
	         //Print Valid message
	         
	         
	         @Test
	         public static void main(String[] args) throws Exception {
	     		// TODO Auto-generated method stub
	        	
	     		//Declare variables
	     		String sDefaultPath;
	     		
	     		//Get Workspace path
	     		sDefaultPath = System.getProperty("user.dir");
	             sDefaultPath = sDefaultPath.replace("batch", "");
	             
	             //Print out to Console
	             System.out.println("The file path for the workspace is: "+sDefaultPath);
	     		
	             //Call the function to read the excel file from the path located within the framework
	     		readExcel(sDefaultPath + "/TestData/SeleniumAssessment.xlsx","Sheet1");
	     		
	             //Call the function to write to the excel file from the path located within the framework
	     		writeExcel(sDefaultPath + "/TestData/SeleniumAssessment.xlsx","Sheet1");
	     	}
	     	
	     	public static void readExcel(String filePath, String sheetName) throws IOException
	     	{
	     		//create an object of FileInputStream class to read excel file
	     		FileInputStream inputStream = new FileInputStream(new File(filePath));
	     		
	     		//Set Workbook to null
	     		Workbook mentorshipWorkbook = new XSSFWorkbook(inputStream);
	     		
	     		//Read the sheet inside of the workbook
	     		Sheet automationSheet = mentorshipWorkbook.getSheet(sheetName);
	     		
	     		//Find the number of rows in the excel sheet
	     		int rowCount = automationSheet.getLastRowNum() - automationSheet.getFirstRowNum();
	     		
	     		//Print out to Console the number of Rows (excluding the first row)
	     		System.out.println("The total number of row are: " + rowCount);
	     		
	     		//Create a loop over all the rows of excel file to read it 
	     		for(int x = 0; x < rowCount+1; x++)
	     		{
	     			Row row = automationSheet.getRow(x);
	     			
	     			//Create a loop to print cell values  in a row
	     			for(int y=0; y < row.getLastCellNum(); y++)
	     			{
	     				System.out.print(row.getCell(y).getStringCellValue()+ " || ");
	     			}
	     			System.out.println();
	     		}
	     		
	     		inputStream.close();
	     	}
	     	
	     	public static void writeExcel(String filePath, String sheetName) throws IOException
	     	{
	     		//create an object of FileInputStream class to read excel file
	     		FileInputStream inputStream = new FileInputStream(new File(filePath));
	     		
	     		//Set Workbook to null
	     		Workbook mentorshipWorkbook = new XSSFWorkbook(inputStream);
	     		
	     		//Read the sheet inside of the workbook
	     		Sheet automationSheet = mentorshipWorkbook.getSheet(sheetName);
	     		
	     		//Find the number of rows in the excel sheet
	     		int rowCount = automationSheet.getLastRowNum() - automationSheet.getFirstRowNum();
	     		
	     		//Print out to Console the number of Rows (excluding the first row)
	     		System.out.println("The total number of row are: " + rowCount);
	     		
	     		//Create a loop over all the rows of excel file to read it 
	     		for(int x = 0; x < rowCount+1; x++)
	     		{
	     			//Set the Row to use
	     			Row row = SeleniumAssessment.getRow(x);
	     			
	     			//Create a loop to print cell values  in a row
	     			for(int y=0; y < row.getLastCellNum(); y++)
	     			{
	     				//Checks if the Cell values equals the criteria listed below
	     				if(row.getCell(y).getStringCellValue().equals("bag"))
	     				{
	     					//Row rowNew = SeleniumAssessment.getRow(x);
	     					Cell cell = row.createCell(y);
	     					cell.setCellValue("fitbit");
	     				}
	     				System.out.print(row.getCell(y).getStringCellValue()+ " || ");
	     			}
	     			System.out.println();
	     		}
	     		
	     		//Close InputStream
	     		inputStream.close();
	     		
	     		//create an object of FileInputStream class to read excel file
	     		FileOutputStream outputStream = new FileOutputStream(new File(filePath));
	     		
	     		//Write changes to Spreadsheet and Save
	     		mentorshipWorkbook.write(outputStream);
	     		
	     		//Close OutputStream
	     		outputStream.close();
	     	}
	     	{

	     }
	{
	         
	       //Create a loop over all the rows of excel file to read it 
	 		int rowCount = 0;
			for(int x = 0; x < rowCount+1; x++)
	 		{
	 			//Set the Row to use
	 			Row row = SeleniumAssessment.getRow(x);
	 			
	 			//Create a loop to print cell values  in a row
	 			for(int y=0; y < row.getLastCellNum(); y++);
	 				
	 			
		}
	    	}
	    }
