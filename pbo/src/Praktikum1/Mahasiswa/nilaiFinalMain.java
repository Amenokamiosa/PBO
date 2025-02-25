package Praktikum1.Mahasiswa;

import java.util.Scanner;

public class nilaiFinalMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uts1, uts2, uas;
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int n = input.nextInt();
        String[] nama = new String[n];  
        double[] hasilAkhir = new double[n];
        char[] predikat = new char[n];
        
        input.nextLine();  
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama mahasiswa: ");
            nama[i] = input.nextLine();  

            System.out.print("Masukkan nilai uts1: ");
            uts1 = input.nextInt();
            input.nextLine(); 

            System.out.print("Masukkan nilai uts2: ");
            uts2 = input.nextInt();
            input.nextLine(); 

            System.out.print("Masukkan uas: ");
            uas = input.nextInt();
            input.nextLine(); 

            hasilAkhir[i] = HitFinal(uts1, uts2, uas);
            predikat[i] = konversi(hasilAkhir[i]);
        }

        System.out.println("No. \t Nama Mahasiswa \t Nilai Akhir \t Predikat");
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + "\t");
            System.out.print(nama[i] + "\t\t\t");
            System.out.print(hasilAkhir[i] + "\t\t");
            System.out.println(predikat[i]);
        }
    }

    static double HitFinal(double a, double b, double c) {
        double Final = 0.3 * a + 0.3 * b + 0.4 * c;
        return Final;
    }

    static char konversi(double a) {
        char predikat;
        if (a >= 80) {
            predikat = 'A';
        } else if (a >= 65 && a < 80) {
            predikat = 'B';
        } else if (a >= 55 && a < 65) {
            predikat = 'C';
        } else if (a >= 45 && a < 55) {
            predikat = 'D';
        } else {
            predikat = 'E';
        }
        return predikat;
    }
}
