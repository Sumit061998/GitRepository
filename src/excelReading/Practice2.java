package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		   File f=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");
          Sheet sheet = WorkbookFactory.create(f).getSheet("NEW");
          
          int rowcount = sheet.getLastRowNum();
          System.out.println(rowcount);
          
          short cellcount = sheet.getRow(0).getLastCellNum();
          System.out.println(cellcount);
          int totalcellcount = cellcount-1;
          
          //Static Code
          //single row 
          for(int i=0;i<=3;i++)
          {
        	  String values = sheet.getRow(2).getCell(i).getStringCellValue();
              System.out.print(values+" ");
          
          }
          System.out.println();
          System.out.println("==================");
          //Dynamic
          for(int i=0;i<=totalcellcount;i++)
          {
        	  String values = sheet.getRow(1).getCell(i).getStringCellValue();
              System.out.print(values+" ");

        	  }
          System.out.println();
          System.out.println("==================");
          //single column//static code
          for(int i=0;i<=5;i++)
          {
        	  String values1 = sheet.getRow(i).getCell(2).getStringCellValue();
              System.out.println(values1+" ");

        	  
          }
          System.out.println();
          System.out.println("==================");
          //single column//dynamic
          for(int i=0;i<=rowcount;i++)
          {
        	  String values2 = sheet.getRow(i).getCell(3).getStringCellValue();
              System.out.println(values2+" ");

          }
          System.out.println();
          System.out.println("==================");
          //Whole Excel Sheet //Static
          
          for(int i=0;i<=5;i++)
          {
        	  for(int j=0;j<=3;j++)
        	  
        	  {  String values3 = sheet.getRow(i).getCell(j).getStringCellValue();
                 System.out.print(values3+" ");
	
          }
        	  System.out.println();
          
	}
          System.out.println();
          System.out.println("==================");
          //whole excel sheet//dynamic
          for(int i=0;i<=rowcount;i++)
          {
        	  for(int j=0;j<=totalcellcount;j++)
        	  {
        		  String values4 = sheet.getRow(i).getCell(j).getStringCellValue();
                  System.out.print(values4+" ");
        	  }
        	  System.out.println();
          }
	}
}