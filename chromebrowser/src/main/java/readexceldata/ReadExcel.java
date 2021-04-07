package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
	
		File src=new File("C:\\Users\\fbfai\\Desktop\\D\\Java\\Test.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int Trow_num=sheet1.getLastRowNum();
	
		for(int i=0; i<Trow_num;i++) {
			
		String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
		String data1=sheet1.getRow(i).getCell(1).getStringCellValue();
		
		System.out.println("row "+i+"="+data0);
		System.out.println("row "+i+"="+data1);	
		}
		
	}

}
