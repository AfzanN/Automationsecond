package login;

import java.io.IOException;


import genericutility.Excelutility;


public class Demo2 {
	
	public void test() throws  IOException {
		
		Excelutility Elib = new Excelutility();
		
		 String URL = Elib.getdatafromExcel("Login", 1, 0);
		 
		 String EMAIL = Elib.getdatafromExcel("Login", 1, 1);
		 System.out.println(EMAIL);
		 String PASSWORD = Elib.getdatafromExcel("Login", 1, 2);
		 System.out.println(PASSWORD);
		 System.out.println(URL);
		 
	}		

}
