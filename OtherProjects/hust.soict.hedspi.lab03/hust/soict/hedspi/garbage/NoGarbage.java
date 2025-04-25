package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws Exception {
        String filename = "test.txt";  // hoặc test.txt nếu bạn dùng file văn bản lớn
        byte[] inputBytes = { 0 };

        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));

        startTime = System.currentTimeMillis();

        StringBuffer outputBuffer = new StringBuffer();  // sử dụng StringBuffer để tối ưu

        for (byte b : inputBytes) {
            outputBuffer.append((char) b);
        }

        String outputString = outputBuffer.toString();

        endTime = System.currentTimeMillis();

        System.out.println("Time using StringBuffer: " + (endTime - startTime) + "ms");
    }
}
