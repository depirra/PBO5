/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5;

/**
 *
 * @author Lenovo AMD3020E
 */
import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tampilan Input");
        System.out.println("NPM             : ");
        String npm = input.nextLine();
        System.out.println("Nama Mahasiswa  : ");
        String nama = input.nextLine();
        System.out.println("Nilai Kehadiran : ");
        double nilaiHadir = input.nextDouble();
        System.out.println("Nilai Tugas     : ");
        double nilaiTugas = input.nextDouble();
        System.out.println("Nilai UTS       : ");
        double nilaiUts = input.nextDouble();
        System.out.println("Nilai UAS       : ");
        double nilaiUas = input.nextDouble();
        System.out.println();
        
        double nilaiAkhir = (0.1 * nilaiHadir) + (0.2 * nilaiTugas) + (0.3 * nilaiUts) + (0.4 * nilaiUas);
        
        char grade;
        String keterangan;
        if (nilaiAkhir >= 76){
            grade = 'A';
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66){
            grade = 'B';
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56){
            grade = 'C';
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46){
            grade = 'D';
            keterangan = "KURANG SEKALI";
        } else {
            grade = 'E';
            keterangan = "KURANG SEKALI";
        }
        
        System.out.println ("Tampilan Output");
        System.out.println ("NPM Mahasiswa  : " +npm);
        System.out.println ("Nama Mahasiswa : " +nama);
        System.out.println ("Nilai Akhir    : " +nilaiAkhir);
        System.out.println ("Grade          : " +grade);
        System.out.println ("Keterangan     : " +keterangan);
    }
}
