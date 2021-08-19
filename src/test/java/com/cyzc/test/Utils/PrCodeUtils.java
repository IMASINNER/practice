package com.cyzc.test.Utils;

import java.util.Random;
import org.junit.Test;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-02-02
 */
public class PrCodeUtils {



    @Test
    public  void getRandomString(){


        int length =5;

        String str="ABCDEFGHJKLMNPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<length;i++){
            //
            int number=random.nextInt(35);
            sb.append(str.charAt(number));
        }
       // return sb.toString();
        System.out.println(sb.toString());
    }

}