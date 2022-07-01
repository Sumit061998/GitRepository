package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetUse {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{   File f=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");
         Sheet sheet = WorkbookFactory.create(f).getSheet("DATA2");
         //Multiple Types Of Data Reading
         int rowcount = sheet.getLastRowNum();
         int cellcount = sheet.getRow(rowcount).getLastCellNum()-1;
         
          for(int i=0;i<=rowcount;i++)
          {      
         for(int j=0;j<=cellcount;j++)
         {
         Cell cell = sheet.getRow(i).getCell(j);
         CellType type = cell.getCellType();
             if(type==CellType.STRING)
             {
            	 System.out.print(cell.getStringCellValue()+" ");
             }
             else if (type==CellType.BOOLEAN) 
             {
		        System.out.print(cell.getBooleanCellValue()+" ");		
			}                
             else if (type==CellType.NUMERIC) 
             {
            	 System.out.print(cell.getNumericCellValue()+" ");
			}  else if (type==CellType.BLANK) 
			{
				System.out.println("null"+" ||");
			} 
         } 
         System.out.println();
         }
	}

}
