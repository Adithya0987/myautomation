package DataDrivers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExecl {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File abspath= new File("./TestData/Proper.xlsx");
		FileInputStream Exel= new FileInputStream(abspath);
		Workbook workbook = WorkbookFactory.create(Exel);
		String wor = workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.setProperty(null, null);
	}

}
