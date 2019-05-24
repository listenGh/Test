/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author lenovo
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelUtils {
 
	/**
	 * 根据文件路径，生成workbook实例
	 * @param filePath
	 * @return
	 */
	public static Workbook readExcel(String filePath) {
		Workbook workbook = null;
		if(filePath == null) return null;
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(inputStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook;
	}
	
	/**
	 * 通过流获取workbook的实例
	 * @param in
	 * @return
	 */
	public static Workbook readExcel(InputStream in) {
		Workbook workbook = null;
		try {
			//这里仅仅解析的是xlsx类型的excel，如果是xls格式的new HSSFWorkbook(in)，大家可根据文件的后缀不同，自动适配
			workbook = new XSSFWorkbook(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook;
	}
	
	public static ArrayList<Map<String, String>> analysisWorkbook(Workbook workbook){
		if(workbook == null) return null;
		ArrayList<Map<String,String>> result = new ArrayList<>();
		//定义excel有哪些字段
		String[] colunms = {"学生ID","名字","密码","性别","所属班级ID"};
		//获取第一个sheet
		Sheet firstSheet = workbook.getSheetAt(0);
		int rowNums = firstSheet.getPhysicalNumberOfRows();
		//获取第一行
		Row row = firstSheet.getRow(0);
		//获取最大的列数
		int colunmNums = row.getPhysicalNumberOfCells();
		
		for(int i=1;i<rowNums;i++) {
			row = firstSheet.getRow(i);
			Map<String,String> cellMap = new HashMap<>();
			if(row!=null) {
				for(int j=0;j<colunmNums;j++) {
					cellMap.put(colunms[j],(String) getCellValue(row.getCell(j)));
				}
			}
			result.add(cellMap);
		}
		return result;
	}
	
	/**
	 * 获取每一个excel表格中的value
	 * @param cell
	 * @return
	 */
	public static Object getCellValue(Cell cell) {
		Object result = null;
		if(cell == null) return null;
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_NUMERIC:
			result = String.valueOf(cell.getNumericCellValue());
			break;
		case Cell.CELL_TYPE_FORMULA:
			//判断cell是否是日期格式
			if(DateUtil.isCellDateFormatted(cell)) {
				result = cell.getDateCellValue();
			}else {
				result = String.valueOf(cell.getNumericCellValue());
			}
			break;
		case Cell.CELL_TYPE_STRING:
			result = cell.getRichStringCellValue().getString();
			break;
		default:
			result="";
			break;
		}
		return result;
	}
}
