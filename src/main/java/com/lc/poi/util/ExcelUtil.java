package com.lc.poi.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

public class ExcelUtil {
	public static String[] getRowsName(Class beanClass) {
		Field fields[] = beanClass.getDeclaredFields();
		List<String> strs = new ArrayList<String>();
		for (Field field : fields) {
			strs.add(field.getName());
		}
		int size = strs.size();
		return (String[]) strs.toArray(new String[size]);
	}

	public static <T> void exportExcel(List<T> data, String title)
			throws IllegalArgumentException, IllegalAccessException, IOException {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet(title);
		sheet.setDefaultColumnWidth((short) 15);
		String[] firstLine = getRowsName(data.get(0).getClass());
		// 生成一个样式
		HSSFCellStyle style = wb.createCellStyle();
		HSSFRow head = sheet.createRow(0);
		//style.setAlignment(HorizontalAlignment.CENTER);
		// 根据选择的字段生成表头
		for (int i = 0; i < firstLine.length; i++) {
			HSSFCell cell = head.createCell(i);
			cell.setCellValue(firstLine[i]);
			cell.setCellStyle(style);
		}
		List<List<String>> datas = getData(data);
		for (int i = 0; i < datas.size(); i++) {
			HSSFRow row = sheet.createRow(i+1);
			for (int j = 0; j < datas.get(i).size(); j++) {
				HSSFCell cell = row.createCell(j);
				cell.setCellValue(datas.get(i).get(j));
 				cell.setCellStyle(style);
			}
		}
		File file = new File("E://"+title+".xls");
		FileOutputStream xls = new FileOutputStream(file);
		wb.write(xls);
		xls.close();
		System.out.println("success");
	}

	public static <T> List<List<String>> getData(List<T> data)
			throws IllegalArgumentException, IllegalAccessException {
		List<List<String>> result = new ArrayList<List<String>>();
		for (int i = 0; i < data.size(); i++) {
			T t = data.get(i);
			Field[] fields = t.getClass().getDeclaredFields();
			Field.setAccessible(fields, true);
			List<String> line = new ArrayList<String>();
			for (int j = 0; j < fields.length; j++) {
				Object cell = fields[j].get(t);
				if (cell != null) {
					line.add(cell.toString());
				} else {
					line.add("");
				}
			}
			result.add(line);
		}
		return result;
	}
}
