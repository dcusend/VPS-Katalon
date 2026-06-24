package pages

import com.kms.katalon.core.annotation.Keyword
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook




public class WriteExcel {

	private static int i = 0

	private static Row getOrCreateRow(XSSFSheet sheet, int rowIndex) {
		Row row = sheet.getRow(rowIndex)
		return (row != null) ? row : sheet.createRow(rowIndex)
	}

	private static Cell getOrCreateStringCell(Row row, int columnIndex) {
		Cell cell = row.getCell(columnIndex)
		return (cell != null) ? cell : row.createCell(columnIndex, CellType.STRING)
	}

	@Keyword
	public static void demoKey(String resultText, String dateText, String resultColumn, String dateColumn, String fileLocation, String sheetName, int rowNumber) throws IOException {
		new FileInputStream(fileLocation).withCloseable { fis ->
			new XSSFWorkbook(fis).withCloseable { workbook ->
				XSSFSheet sheet = workbook.getSheet(sheetName)
				if (sheet == null) {
					throw new IllegalArgumentException("Sheet not found: " + sheetName)
				}

				int rowCount = rowNumber
				Row row = getOrCreateRow(sheet, rowCount)

		System.out.println(resultText)
				if (resultColumn == 'Result' || resultColumn == 'ResultProd') {
					Cell cell = getOrCreateStringCell(row, 0)
					cell.setCellValue(resultText)
			System.out.println("resultText: " + resultText)
					i = 0
				}

				if (dateColumn == 'Date' || dateColumn == 'DateProd') {
					Cell cell2 = getOrCreateStringCell(row, 1)
					cell2.setCellValue(dateText)
			System.out.println("dateText: " + dateText)
				}

				if (resultColumn == 'ResultDemo') {
					Cell cell = getOrCreateStringCell(row, 2)
					cell.setCellValue(resultText)
			System.out.println("resultText: " + resultText)
					i = 0
				}

				if (dateColumn == 'DateDemo') {
					Cell cell2 = getOrCreateStringCell(row, 3)
					cell2.setCellValue(dateText)
			System.out.println("dateText: " + dateText)
				}

				new FileOutputStream(fileLocation).withCloseable { fos ->
					workbook.write(fos)
				}
			}
		}
	}
}
