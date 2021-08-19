package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
//import MobileBuiltInKeywords as Mobile
//import WSBuiltInKeywords as WS
//import WebUiBuiltInKeywords as WebUI
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class WriteExcel {



	private  static int i=0;

	@Keyword
	public static void demoKey(String resultText,String dateText, String resultColumn, String dateColumn, String fileLocation, String sheetName, int rowNumber) throws IOException{
		//FileInputStream fis = new FileInputStream("C:\\KatalonData\\SampleTestdata.xlsx");
		FileInputStream fis = new FileInputStream(fileLocation);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int rowCount = rowNumber;
		if (resultColumn =='Result'){
			Row row = sheet.getRow(rowCount);
			Cell cell = row.createCell(0,0);
			cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue(resultText);
			System.out.println("resultText: " + resultText)
			i = 0;
		}

		if (dateColumn =='Date'){
			Row row2 = sheet.getRow(rowCount);
			Cell cell2 = row2.createCell(1,0);
			cell2.setCellType(cell2.CELL_TYPE_STRING);
			cell2.setCellValue(dateText);
			System.out.println("dateText: " + dateText)
			//i = rowCount+1;
		}

		//FileOutputStream fos = new FileOutputStream("C:\\KatalonData\\SampleTestdata.xlsx");
		FileOutputStream fos = new FileOutputStream(fileLocation);
		workbook.write(fos);
		fos.close();
	}








}
