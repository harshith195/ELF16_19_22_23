package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author DEll
 *
 */
public class ToReadDataFromExternalResource {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File absPath = new File("./resources/testData.xlsx");		
		FileInputStream fis = new FileInputStream(absPath);
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		
		int noOfRows = sheet.getPhysicalNumberOfRows();		
		int noOfColumns = sheet.getRow(4).getPhysicalNumberOfCells();
		
		String[][] sarr = new String[noOfRows][noOfColumns];
		
		for(int i=0;i<noOfRows;i++) {
			for(int j=0;j<noOfColumns;j++) {
				sarr[i][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		
		for(String[] arr:sarr) {
			for(String data : arr) {
				System.out.print(data+", ");
			}
			System.out.println();
		}
		
		
	}
	
	


}
