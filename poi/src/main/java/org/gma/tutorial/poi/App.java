package org.gma.tutorial.poi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.common.usermodel.fonts.FontFamily;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();

		HSSFSheet sheet = workbook.createSheet("Poi Test Sheet");

		HSSFRow row = sheet.createRow(1);

		sheet.addMergedRegion(new CellRangeAddress(1, 1, 1, 4));

		for (int i = 1; i < 5; i++) {
			if (i == 1)
				row.createCell(i).setCellValue("Merged Region");
			else
				row.createCell(i).setCellValue("");
		}

		HSSFRow row2 = sheet.createRow(2);
		row2.createCell(1).setCellValue("Item 1");
		row2.createCell(2).setCellValue("Item 2");
		row2.createCell(3).setCellValue("Item 3");
		row2.createCell(4).setCellValue("Item 4");
		
		HSSFFont font = workbook.createFont();
		font.setFontName(FontFamily.FF_ROMAN.toString());
		font.setBold(true);
		font.setFontHeightInPoints((short) 9);

		CellStyle style = workbook.createCellStyle();
		style.setFont(font);
		style.setWrapText(false);
		style.setAlignment(HorizontalAlignment.CENTER);
		style.setBorderBottom(BorderStyle.THIN);
		style.setBorderLeft(BorderStyle.THIN);
		style.setBorderRight(BorderStyle.THIN);
		style.setBorderTop(BorderStyle.THIN);
		style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		

		for (int i = 1; i < 3; i++) {
			for (Cell cell : sheet.getRow(i)) {
				cell.setCellStyle(style);
			}
		}
		
		FileOutputStream out = new FileOutputStream(new File("POI_Excel.xls"));
		workbook.write(out);
		out.close();

	}
}
