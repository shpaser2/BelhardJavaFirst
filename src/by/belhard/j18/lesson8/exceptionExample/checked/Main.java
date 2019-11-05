package by.belhard.j18.lesson8.exceptionExample.checked;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/nofile.no");

        try {
            method1(file);
        } catch (FileNotFoundException e) { //узкий тип раньше широкого
            e.printStackTrace();
            System.err.println(e); //stream for console with red symbols
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("end of program");
    }

//    public static void main(String[] args) throws Exception{  //for fast wrote programs
//                                                                  // - this shows printStackTrace() for any Exception
//                                                                    //but program stops with printStackTrace. As without this.
//        File file = new File("C:/nofile.no");
//
//        method1(file);
//
//        System.out.println("end of program");
//    }

    private static void method1(File file) throws IOException{
//        try {
        OutputStream stream = new FileOutputStream(file);
        stream.write(1);

//        } catch (FileNotFoundException e) { //узкий тип раньше широкого
//            e.printStackTrace();
//            System.err.println(e); //stream for console with red symbols
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        /*
        //another variant
        //because FileNotFoundException extends IOException
         catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    //valid code
//    private static void method1(File file){
//        try {
//            OutputStream stream = new FileOutputStream(file);
//            stream.write(1);
//        } catch (FileNotFoundException e) { //узкий тип раньше широкого
//            e.printStackTrace();
//            System.err.println(e); //stream for console with red symbols
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        /*
//        //another variant
//        //because FileNotFoundException extends IOException
//         catch (IOException e) {
//            e.printStackTrace();
//        }
//        */
//    }
}
