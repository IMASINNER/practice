package com.cyzc.test;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.google.common.collect.Lists;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.util.StringUtils;

public class testHutools {


    @Test
    public void testHutoolsDemo() throws IOException {
        File file = new File("D:\\counter.xlsx");

        //ExcelReader excelReader= ExcelUtil.getReader(file.getI)

        InputStream inputStream = null;

        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("E:\\counter.xlsx"));

        List<List<Object>> realAll = reader.read();
        List<Object> s = realAll.get(0);
        List<String> list = new ArrayList<>();

        for (Object m : s) {
            String l = "private String " + m.toString() + ";";
            list.add(l);
        }
        BufferedWriter bw = null;

        bw = new BufferedWriter(new FileWriter(new File("e:\\1.txt")));

        for (String str : list) {
            bw.write(str, 0, str.length());
            bw.flush();
            bw.newLine();
        }
        bw.close();

        System.out.println(list);


    }

    @Test
    public void test() {
        Double d = 1.00;
        d = null;
        System.out.println(d);


    }

    @Test
    public void testSpring() {
        //
        String path = "http://localhost:8083/Test/test";
        String oo = null;
        if (!StringUtils.isEmpty(path)) {
            oo = path.substring(path.lastIndexOf("/", path.lastIndexOf("/") - 1));
        }
        //获得"Desktop/1.txt",并且不需要前面的"/"

        //"+1"代表在定位时往后取一位,即去掉"/"
        //"-1"代表以"/"字符定位的位置向前取一位
        //从path.lastIndexOf("/")-1位置开始向前寻找倒数第二个"/"的位置

        System.out.println(oo);

    }

    @Test
    public void test3() {
        String s1 = "天津伊势丹adasaas";

        String s2 = "天津伊势丹asdasdaasd";

        for (int i = 0; i < s2.length(); i++) {
            String subStr = s2.substring(i, i + 1);
            System.out.println(subStr);
        }

        char[] c = s2.toCharArray();

        char[] c1 = s1.toCharArray();

        StringBuffer stringBuffer=new StringBuffer();
        for (char cc : c) {
            for (char c2 : c1) {
               if (cc==c2){
                   stringBuffer.append(cc);
               }
            }
        }

        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());

      /*  String[] arr1 = str1.split(",");
        String[] arr2 = str2.split(",");

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j].equals(arr2[i])) {
                    sb.append(arr1[j] + ",");
                }
            }
        }
        System.out.println("结果：" + sb.toString().substring(0, sb.toString().length() - 1));*/

    }

    public boolean test4(String terminalName, String storeName) {
        String s1 = terminalName;

        String s2 = storeName;

        if (s2.contains(s1)) {
            return true;
        }

        char[] c = s2.toCharArray();

        char[] c1 = s1.toCharArray();

        StringBuffer stringBuffer = new StringBuffer();
        for (char cc : c) {
            for (char c2 : c1) {
                if (cc == c2) {
                    stringBuffer.append(cc);

                }
            }
        }
        System.out.println(stringBuffer);
        final String s = removeRepeatChar(stringBuffer);
        System.out.println(s);
        if (s.length() > 7) {
            return true;
        } else {
            return false;
        }

    }

    @Test
    public void test22(){

        final boolean b = test4("北京汉光百货（原中友百货）", "重庆百货大楼股份有限公司新世纪百货宜宾商都");

        System.out.println(b);
    }

    public String removeRepeatChar(StringBuffer s) {
        if (s == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        int len = s.length();
        while (i < len) {
            char c = s.charAt(i);
            sb.append(c);
            i++;
            while (i < len && s.charAt(i) == c) {//这个是如果这两个值相等，就让i+1取下一个元素
                i++;
            }
        }
        return sb.toString();
    }

    @Test
    public void testaasdasdad(){

        String hash = new String(Base64.encode(("pmms-aks-client-id-1" + ":" + "9b6985d3-2bc6-485a-8c89-00d0553f8c0b").getBytes()));
        String auth = "Basic " + hash;

        System.out.println(auth);


    }

    @Test
    public void testAAAAA(){

        final ArrayList<String> strings = Lists.newArrayList("1", "2", "3", "4", "5","6");
        final List<List<String>> partition = Lists.partition(strings, 3);

        System.out.println(partition);

    }

 //   private JavaMailSender javaMailSender;

    @Test
    public void sendMail() {
        MailAccount account = new MailAccount();
        account.setHost("smtp.qq.com");
        account.setPort(465);
        account.setAuth(true);
        account.setFrom("1021981208@qq.com");
        account.setUser("1021981208@qq.com");
        account.setPass("gzypmrsxvfgkbgac"); //密码
        account.setSocketFactoryClass("javax.net.ssl.SSLSocketFactory");
        account.setSslEnable(true);
        String username="pmmsliba";
        String password="1234561111";

        String content="账号:"+username+"密码："+password;

        final String s = MailUtil.send(account, CollUtil.newArrayList("870887241@qq.com"), "测试",
                content, false);

        System.out.println(s);


    }

}
