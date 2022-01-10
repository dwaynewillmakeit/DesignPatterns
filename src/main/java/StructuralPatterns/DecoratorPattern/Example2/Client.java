package StructuralPatterns.DecoratorPattern.Example2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Client {

    public static void main(String[] args) {
        int c;

        StringBuffer stringBuffer = new StringBuffer("TESTING FILE FOR DECORATORS");
        byte[] bytes = stringBuffer.toString().getBytes(StandardCharsets.UTF_8);
        try {
            InputStream inputStream =  new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c= inputStream.read())>=0){


                System.out.println((char) c);
            }
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
