package dataDrivenTesting;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
@SuppressWarnings("resource")
public class ToReadDataFromCSVFile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("./resources/csvfile.csv");
		CSVReader reader = new CSVReader(fr);
		
		List<String[]> allData = reader.readAll();
		for(String[] sarr : allData) {
			for(String s : sarr) {
				System.out.print(s+", ");
			}
			System.out.println();
		}
		
		String[] urlData = reader.readNext();
		System.out.println(urlData[0]);
		System.out.println(urlData[1]);
	}

}
