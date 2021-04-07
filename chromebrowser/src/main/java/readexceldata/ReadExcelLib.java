package readexceldata;

import library.ExcelDataConfig;

public class ReadExcelLib {

	public static void main(String[] args) {
		
	ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\fbfai\\Desktop\\D\\Java\\Test.xlsx");	
	
	String data=excel.getdata(0, 0, 0);
	
	System.out.println(data);
	
	}

}
