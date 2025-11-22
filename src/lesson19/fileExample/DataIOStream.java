package lesson19.fileExample;

import java.io.*;


public class DataIOStream {
        private static final String FILE_PATH = "C:\\Users\\samve\\JavaCore\\src\\lesson19\\file.txt";

    public static void main(String[] args) {
        write();
        read();
    }

    public static void write(){
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH))){
            out.writeInt(888);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error opening file");
        }
    }

    public static void read(){
        try(DataInputStream in = new DataInputStream(new FileInputStream(FILE_PATH))){
            System.out.println(in.readInt());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error opening file");
        }

    }
}
