package Praktikum1;
public class lingkaran {
    
    private double r;
    private double luas;
    private final double PHI=3.14;
    
    public void luas(double r)
    {
        luas = PHI*r*r;
        System.out.println("Luas lingkaran dengan jari "+r+" adalah : "+luas);
    }
    
}
