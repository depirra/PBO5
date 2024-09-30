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
public class potonganPembelian {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Total Pembelian : ");
        double pembelian = input.nextDouble();
        System.out.println();
        
        double potongan;
        if (pembelian <= 50000){
            potongan = 0.05;
        } else{
            potongan = 0.2;
        }
        
        System.out.println("Total Pembelian              : Rp." +pembelian);
        System.out.println("Besarnya Potongan            : Rp." +(potongan * pembelian));
        System.out.println("Jumlah yang harus dibayarkan : Rp." +(pembelian - (potongan * pembelian)));
    }
}
