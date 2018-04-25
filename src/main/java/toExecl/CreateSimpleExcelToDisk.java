package toExecl;

import org.apache.poi.hssf.usermodel.*;

import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 手动创建一个简单的Execl
 */
public class CreateSimpleExcelToDisk {

    public static void createExcel(List list, String sheetName, String excelName, String excelAddress) {

        //创建一个webbook，对应一个Execl
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        //添加一个sheet
        HSSFSheet hssfSheet = hssfWorkbook.createSheet(sheetName);
        //再开头添加一个空行
        HSSFRow hssfRow = hssfSheet.createRow(0);
        //创建单元格,设置值表头 设置表头居中
        HSSFCellStyle hssfCellStyle = hssfWorkbook.createCellStyle();
        hssfCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);

        HSSFCell hssfCell = hssfRow.createCell((short) 0);
        hssfCell.setCellValue("学号");
        hssfCell.setCellStyle(hssfCellStyle);
        hssfCell = hssfRow.createCell((short) 1);
        hssfCell.setCellValue("姓名");
        hssfCell.setCellStyle(hssfCellStyle);
        hssfCell = hssfRow.createCell((short) 2);
        hssfCell.setCellValue("年龄");
        hssfCell.setCellStyle(hssfCellStyle);
        hssfCell = hssfRow.createCell((short) 3);
        hssfCell.setCellValue("生日");
        hssfCell.setCellStyle(hssfCellStyle);

        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
        for (int i = 0; i < list.size(); i++) {
            hssfRow = hssfSheet.createRow((int) i + 1);
            Member stu = (Member) list.get(i);
            // 第四步，创建单元格，并设置值
            hssfRow.createCell((short) 0).setCellValue((double) stu.getCode());
            hssfRow.createCell((short) 1).setCellValue(stu.getName());
            hssfRow.createCell((short) 2).setCellValue((double) stu.getAge());
            hssfCell = hssfRow.createCell((short) 3);
            hssfCell.setCellValue(new SimpleDateFormat("yyyy-mm-dd").format(stu
                    .getBirth()));
        }
        try {
            StringBuffer name = new StringBuffer();
            name.append(excelAddress);
            name.append("/");
            name.append(excelName);
            name.append(".xls");
            FileOutputStream fout = new FileOutputStream(name.toString());
            hssfWorkbook.write(fout);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ParseException {
        List list = new ArrayList();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");

        Member user1 = new Member(1, "熊大", 24, df.parse("1993-08-28"));
        Member user2 = new Member(2, "熊二", 23, df.parse("1994-08-19"));
        Member user3 = new Member(3, "熊熊", 24, df.parse("1983-11-22"));
        list.add(user1);
        list.add(user2);
        list.add(user3);
        createExcel(list,"学生","学生表","C:/Users/wjs/Desktop");
    }
}
