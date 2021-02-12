import javax.swing.JOptionPane;
public class HitungRataMaks {
    
    public static void main(String[] args) {
        int[] nilai = new int[10];
        int max,min;
        double avg = 0;
        int i;

        System.out.println("PROGRAM HITUNG RATA-RATA DAN MAX");
        System.out.println("================================");

        for(i=0; i<10; i++){
            String bil = JOptionPane.showInputDialog("Masukkan angka : ");
            nilai[i] = Integer.parseInt(bil);
            System.out.println("Input Angka ke "+i+" : " + bil);
        }
        //fungsi max
        min = nilai[0];
        max = nilai[0];
        for(i=0; i<10; i++){
            if (nilai[i]>max) {
                max = nilai[i];
            }else if(nilai[i]<min){
                min = nilai[i];
            }
        }
        //fungsi avg
        for(i=0; i<10; i++)
            avg += nilai[i];
            avg = avg/i; 
        System.out.println("================================");
        System.out.println("Nilai rata-rata = "+" "+avg);
        System.out.println("Nilai maksimal / minimal  = "+" "+max+" / "+min);
        System.out.println("================================");
        System.exit(0);
    }
}