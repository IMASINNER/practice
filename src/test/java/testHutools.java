import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.util.StringUtils;

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

    @Test
    public void test(){
        Double d=1.00;
        d=null;
        System.out.println(d);


    }

    @Test
    public void testSpring(){
        //
        String path="http://localhost:8083/Test/test";
        String oo=null;
        if (!StringUtils.isEmpty(path)){
            oo=path.substring(path.lastIndexOf("/",path.lastIndexOf("/")-1));
        }
        //获得"Desktop/1.txt",并且不需要前面的"/"

        //"+1"代表在定位时往后取一位,即去掉"/"
        //"-1"代表以"/"字符定位的位置向前取一位
        //从path.lastIndexOf("/")-1位置开始向前寻找倒数第二个"/"的位置

        System.out.println(oo);

    }
}
