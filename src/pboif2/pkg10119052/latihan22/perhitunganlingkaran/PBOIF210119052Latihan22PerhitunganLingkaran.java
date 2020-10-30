package pboif2.pkg10119052.latihan22.perhitunganlingkaran;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program perhitungan lingkaran
 * 
 */
public class PBOIF210119052Latihan22PerhitunganLingkaran {


    public static void main(String[] args) {
        // TODO code application logic here
        
        int diameterLingkaran;
        int jari;
        double phi = 3.14;
        
        Scanner in= new Scanner(System.in);
        System.out.println("======Perhitungan Lingkaran======");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        diameterLingkaran = in.nextInt();
        
        System.out.println(); 
       
        System.out.println("======Hasil Perhitungan Lingkaran====");
        
        jari = diameterLingkaran/2;
        System.out.println("Jari-jari Lingkaran = "+jari+" cm");
        double l = phi * (jari * jari);
        System.out.printf("Luas Lingkaran = %.2f", l);
        System.out.printf(" cm %n");
        double k = 2*(phi*jari);
        System.out.printf("Luas Lingkaran = %.2f", k);
        System.out.printf(" cm %n");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Developed By Rizki Dwi Nugraha");
        
    }
    
}
