import net.bytebuddy.utility.RandomString;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public  class CounterCodeUtils {

    private static final String[] symbol=new String[]{"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F",
            "G","H","J","K","L","M","N","P","Q","R","S","T","U","V","W","X","Y","Z"};

    public static String createGroupCode(){
        final RandomString randomString = new RandomString(8);

        final String randomCode = randomString.nextString();

        final Calendar calendar = Calendar.getInstance();

        final long year = calendar.get(Calendar.YEAR);
        final long month = calendar.get(Calendar.MONTH);
        final long day = calendar.get(Calendar.DAY_OF_MONTH);

        int levelIndex = 0;
        final int yearIndex = (int) (year % 100);
        final int monthIndex = (int) month  + 1;
        final int dayIndex = (int) day;
        final String randmoCodeString = yearIndex + symbol[monthIndex] + symbol[dayIndex] + randomCode;
        return randmoCodeString;
    }


    @Test
    public void getCode(){
        List<String> l=new ArrayList<>();
        for (int i = 0; i <18 ; i++) {
            String s=CounterCodeUtils.createGroupCode();
l.add(s);
        }
        System.out.print(l);

    }

}
