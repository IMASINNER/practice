package lambda;

import org.junit.Test;

public class lambdaTest {


    interface Printer{
        void printer(String S);
    }

    public void pringSomething(String s1,Printer printer){
        printer.printer(s1);

    }

    @Test
    public void testLambdaOne(){
       lambdaTest lambdaTest=new lambdaTest();
       String s1="hello lambda";

       Printer printer=new Printer() {
           @Override
           public void printer(String S) {
               System.out.println(S);
           }
       };
       lambdaTest.pringSomething(s1,printer);

       //new Printer((String S)-> {System.out.println("");})

        Printer printer1=((String s) -> {
            System.out.println("hello lambda");
        });

        Printer printer2=(S -> {
            System.out.println("hello lambda");
        });
        //只有一个参数,去掉括号
        Printer printer3=(S -> {
            System.out.println("hello lambda");
        });
        //方法体只有一行 ，去掉大括号
        Printer printer4=S -> System.out.println("hello lambda");
        ;


        Printer printer5=(S -> {
            System.out.println("hello lambda");
        });
    }
}
