package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    @Test
    public void testForeach(){
        List<String> list=new ArrayList<>();

        list.add("sdadsa");
        list.add("asdas");
        list.add("sdadssssa");
        list.add("sdaaaadsa");
        list.add("sdafgfgdsa");


        list.stream().forEach(System.out::println);

    }

    @Test
    public void testArrayLisrInit(){

        List list=new ArrayList(2^31);

        System.out.println(list);

    }
}
