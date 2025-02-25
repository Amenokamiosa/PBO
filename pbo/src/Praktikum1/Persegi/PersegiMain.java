package Praktikum1.Persegi;
import Praktikum1.Persegi.Persegi;
import javax.swing.JOptionPane;
public class PersegiMain {
    public static void main(String[] args) {
        Persegi objPersegi = new Persegi();
        
        objPersegi.panj = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));
        objPersegi.lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan lebar"));
        
        JOptionPane.showMessageDialog(null, "Luas dari persegi dengan panjang = "+objPersegi.panj+" dan lebar = "+objPersegi.lebar+" adalah "+objPersegi.luas());
    }
    
}
