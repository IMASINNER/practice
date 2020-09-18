import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class testHutools {


    @Test
    public void testHutoolsDemo() throws IOException {
        File file=new File("D:\\counter.xlsx");

        //ExcelReader excelReader= ExcelUtil.getReader(file.getI)

        InputStream inputStream=null;

        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("E:\\counter.xlsx"));


        List<List<Object>> realAll=reader.read();
        List<Object> s=realAll.get(0);
        List<String> list=new ArrayList<>();

        for (Object m:s){
            String l="private String "+m.toString()+";";
            list.add(l);
        }
        BufferedWriter bw=null;


        bw=new BufferedWriter(new FileWriter(new File("e:\\1.txt")));

        for (String str: list){
            bw.write(str,0,str.length());
            bw.flush();
            bw.newLine();
        }
        bw.close();

        System.out.println(list);


    }
}
