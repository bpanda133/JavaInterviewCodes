package ResusableFunction;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.read.biff.BiffException;

public class ExcelReader {
	
	static int DataColCount = 0;
	static int reqrow = 0;
	
	public static void ExcelData(String DataFilePath, String DataSheetName, String TestcaseName)
	{
		
		String key = "";
		String Value = "";
		String tcid = "";
		int dataCounter = 0;
		
		File inputworkbook = new File(".\\TestData\\"+DataFilePath);
		XSSFWorkbook Dataworkbook;
		
		try{
			Dataworkbook = new XSSFWorkbook(inputworkbook);
			
			//Get the desired sheet from the workbook
			XSSFSheet DataSheet = Dataworkbook.getSheet(DataSheetName);
			int rowCount = DataSheet.getPhysicalNumberOfRows();
			
			XSSFRow r = DataSheet.getRow(1);
			DataColCount = r.getPhysicalNumberOfCells();
			
			//Below commented out column can be used incase of Data Driven execution.
			/*if(dataCounter == 0){
				for(int h=0; h <= rowCount; h++)
				{
					tcid = DataSheet.getRow(h).getCell(2).getStringCellValue();
					if(tcid.equalsIgnoreCase(TestcaseName)){
						dataCounter++;
					}
				}
			}*/
			
			for(int u=0; u<= rowCount; u++)
			{
				tcid = DataSheet.getRow(u).getCell(2).getStringCellValue();
				if(tcid.equalsIgnoreCase(TestcaseName)){
					reqrow = u;
					break;
				}
			}
			
			for(int y=0; y<=DataColCount; y++)
			{
				try{
					key = DataSheet.getRow(0).getCell(y).getStringCellValue();
					Value = DataSheet.getRow(reqrow).getCell(y).getStringCellValue();
				}catch(NullPointerException ne){
					Value = "";
					System.out.println("Empty Excel cell");
				}
				GlobalData.ConfigData.put(key, Value);
			}
			
		}catch(InvalidFormatException ie){
			ie.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
