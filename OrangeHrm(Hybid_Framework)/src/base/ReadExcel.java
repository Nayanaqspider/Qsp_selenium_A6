package base;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel extends BaseScript
{
public static String readData(String sheetname,int row1, int cell1) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream(excel_path);
	Workbook book=WorkbookFactory.create(fis);
	Cell sh = book.getSheet(sheetname).getRow(row1).getCell(cell1);
	String val = sh.getStringCellValue();
	return val;
}
}
