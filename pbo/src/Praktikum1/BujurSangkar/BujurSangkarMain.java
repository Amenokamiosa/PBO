package Praktikum1.BujurSangkar;
import java.util.Scanner;
import Praktikum1.BujurSangkar.BujurSangkar;
public class BujurSangkarMain {
    public static void main(String[] args) {
        BujurSangkar bujur1 = new BujurSangkar();
        BujurSangkar bujur2 = new BujurSangkar();
        
        Scanner tombol = new Scanner(System.in);
        System.out.print("Masukan sisi bujur sangkar I : ");
        bujur1.sisi = tombol.nextInt();
        System.out.print("Masukan sisi bujur sangkar II : ");
        bujur1.sisi = tombol.nextInt();
        
        System.out.println("Luas Bujur Sangkar dengan sisi= "+bujur1.sisi+" adalah "+bujur1.luas());
        System.out.println("Luas Bujur Sangkar dengan sisi= "+bujur2.sisi+" adalah "+bujur2.luas());
    }
    
}
