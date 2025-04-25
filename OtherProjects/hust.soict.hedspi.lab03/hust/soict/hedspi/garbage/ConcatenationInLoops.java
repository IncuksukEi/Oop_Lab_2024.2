package hust.soict.hedspi.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        int loopTimes = 65536;

        // Test with String +
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < loopTimes; i++) {
            s += r.nextInt(2);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time using String (+): " + (end - start) + "ms");

        // Test with StringBuilder
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < loopTimes; i++) {
            sb.append(r.nextInt(2));
        }
        s = sb.toString();
        end = System.currentTimeMillis();
        System.out.println("Time using StringBuilder: " + (end - start) + "ms");

        // Test with StringBuffer
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < loopTimes; i++) {
            sbf.append(r.nextInt(2));
        }
        s = sbf.toString();
        end = System.currentTimeMillis();
        System.out.println("Time using StringBuffer: " + (end - start) + "ms");
    }
}
