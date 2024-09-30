/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5;

import java.util.Scanner;

/**
 *
 * @author Lenovo AMD3020E
 */
import java.util.Scanner;
public class IndeksMassaTubuh {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println ("Masukkan Berat Badan (Kg)  : ");
    double beratBadan = input.nextDouble();
    System.out.println ("Masukkan Tinggi Badan (cm) : ");
    double tinggiBadan = input.nextDouble();
    
    double tinggiBadan2 = tinggiBadan / 100;
    double nilaiIMT = (beratBadan)/(tinggiBadan2 * tinggiBadan2);
    
    String kriteria;
    if (nilaiIMT <= 18.4) {
        kriteria = "Berat Badan Kurang";
    } else if (nilaiIMT <= 24.9){
        kriteria = "Berat Badan Ideal";
    } else if (nilaiIMT <= 29.9){
        kriteria = "Berat Badan Lebih";
    } else if (nilaiIMT <= 39.9){
        kriteria = "Gemuk";
    } else {
        kriteria = "Sangat Gemuk";
    }
    
    System.out.println ("Berat Badan    : " +beratBadan+ " kg");
    System.out.println ("Tinggi Badan   : " +tinggiBadan+ " cm");
    System.out.println ("Nilai IMT      : " +nilaiIMT);
    System.out.println ("Kriteria       : " +kriteria);
    }
}   