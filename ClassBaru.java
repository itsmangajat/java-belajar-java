import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ClassBaru {

    public static void main(String[] args) {
        BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        String nim = "";
        System.out.println("Silakan masukkan Nama Anda : "); 

        try {
            nama = datain.readLine();
            System.out.println("Silakan masukkan NIM Anda : ");
            nim = datain.readLine();
        } catch (IOException e) {
            System.out.println("error");
        }
        System.out.println("Nama saya adalah : " + nama);
        System.out.println("NIM saya adalah : " + nim);
    }
}