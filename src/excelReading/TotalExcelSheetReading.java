package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TotalExcelSheetReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 File f=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");
		    Sheet sheet = WorkbookFactory.create(f).getSheet("Sheet3");
		    

		    for(int i=0;i<=3;i++)
		    {
		    	for(int j=0;j<=2;j++)
		    	{
		    		String values = sheet.getRow(i).getCell(j).getStringCellValue();
		    		System.out.print(values+" ");
		    	}
		    	System.out.println();
		    }

	}

}
