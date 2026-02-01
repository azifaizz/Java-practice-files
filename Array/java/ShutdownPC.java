package Array.java;
import java.io.IOException;

public class ShutdownPC {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("shutdown -s -t 0");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
