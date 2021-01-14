/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengembaliansuatunilai;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class PengembalianSuatuNilai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        int a, b, c ;
        
        System.out.println("Program Menjumlahkan 2 Nilai");
        System.out.print("Masukan Nilai A : ");
        a = masukan.nextInt();
        System.out.print("Masukan Nilai B : ");
        b = masukan.nextInt();
        System.out.print("Masukan Nilai C : ");
        c = masukan.nextInt();
        System.out.println();
        System.out.println("Jumlah a + b : " + (jumlah (a,b)));
        System.out.println("Jumlah b + c : " + (jumlah (b,c)));
        System.out.println("Jumlah a + c : " + (jumlah (a,c)));
        
    }

    private static int jumlah(int a, int b) {
    int hasil = a + b ;
    return hasil ;
    
    }
    
}
