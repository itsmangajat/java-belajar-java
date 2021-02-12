import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Math.sqrt;

public class SegitigaBuffered {

    public static void main(String[] args) {
        int alas, tinggi;
        double mir,kel,luas;

        BufferedReader segitiga = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Alas : ");
        try {
            String nAlas = segitiga.readLine();
            alas = Integer.parseInt(nAlas);
            System.out.println("Masukkan Tinggi : ");
            String nTinggi = segitiga.readLine();
            tinggi = Integer.parseInt(nTinggi);
            System.out.println("");

            luas = 0.5*alas*tinggi;
            System.out.println("Luas = " + luas);

            mir = sqrt((alas*alas)+(tinggi*tinggi));

            kel = alas+tinggi+mir;
            System.out.println("Keliling = " + kel);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}