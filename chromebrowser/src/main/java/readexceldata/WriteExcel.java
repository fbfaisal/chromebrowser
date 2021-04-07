package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {

		File source=new File("C:\\Users\\fbfai\\Desktop\\D\\Java\\Test.xlsx");
		FileInputStream fis=new FileInputStream(source);
		XSSFWorkbook wbook=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wbook.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		sheet1.getRow(1).createCell(2).setCellValue("fail");
		
		FileOutputStream fout= new FileOutputStream(source);
		wbook.write(fout);
		wbook.close();

	}

}
