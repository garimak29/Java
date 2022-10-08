package LLD.DecoratorPattern.CustomIODecorator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        ConvertToLowerCase in = null;
        try {
            in =
                    new ConvertToLowerCase(
                            new BufferedInputStream(
                                    new FileInputStream("text")));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) { in.close(); }
        }
        System.out.println();
        try (ConvertToLowerCase in2 =
                     new ConvertToLowerCase(
                             new BufferedInputStream(
                                     new FileInputStream("test.txt"))))
        {
            while((c = in2.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
