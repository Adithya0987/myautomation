package DataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Woork {
	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		File file= new File("./TestData/actitime.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook Wb= WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet s= Wb.getSheet("sheet1");
		int row= s.getPhysicalNumberOfRows()-1;
		int cell = s.getRow(0).getPhysicalNumberOfCells();
		
	}

}
