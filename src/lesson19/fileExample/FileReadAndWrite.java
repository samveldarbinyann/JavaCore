//package lesson19.fileExample;
//
//import java.io.*;
//
//public class FileReadAndWrite {
////    private static String FILE_PATH = "C:\\Users\\samve\\JavaCore\\src\\lesson19\\file.txt";
//
//    public static void main(String[] args) throws IOException {
////        write();
//        read();
//    }
//
//    public static void write() throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH));
//        for (int i = 0; i < 1000; i++) {
//            bw.write("Hello World");
//            bw.newLine();
//        }
//        bw.close();
//    }
//
//    public static void read() throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
//        int c;
//        while ((c = br.read()) != -1) {
//            System.out.print((char) c);
//        }
//        br.close();
//    }
//
//}
