// package Assignment3;

import java.io.File;

public class p5 {
    public static void main(String[] args) {
        File f = new File("Assignment3/abc.txt");
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            System.out.println(f.isDirectory());
            System.out.println(f.isFile());
            System.out.println(f.getName());
            System.out.println(f.getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
