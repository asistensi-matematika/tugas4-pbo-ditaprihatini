
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class MainBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dita = new Scanner(System.in);
        System.out.println("Pilih bangun datar yg diinginkan");
        System.out.println("1. Persegi\n2. Lingkaran\n3. Segitiga");
        System.out.print("Masukkan pilihan Anda : ");
        int pilih = dita.nextInt();
        switch(pilih){
            case 1 :
                System.out.print("Masukkan panjang sisi : ");
                double sisi = dita.nextDouble();
                Persegi square = new Persegi(sisi);
                square.view();
                break;
            case 2 :
                System.out.print("Masukkan panjang jari-jari : ");
                double jari2 = dita.nextDouble();
                Lingkaran circle = new Lingkaran(jari2);
                circle.view();
                break;
            case 3 :
                System.out.println("Pilih Segitiga yang diinginkan");
                System.out.println("1. Segitiga siku-siku");
                System.out.println("2. Segitiga Sama Sisi");
                System.out.print("Masukkan pilihan : ");
                int pilihlagi = dita.nextInt();
                switch(pilihlagi){
                    case 1 :
                        System.out.print("Masukkan panjang alas : ");
                        double alas = dita.nextDouble();
                        System.out.print("Masukkan panjang tinggi : ");
                        double tinggi = dita.nextDouble();
                        SegitigaSiku2 siku = new SegitigaSiku2(alas,tinggi);
                        siku.view(alas,tinggi);
                        break;
                    case 2 :
                        System.out.print("Masukkan panjang alas : ");
                        double alas2 = dita.nextDouble();
                        System.out.print("Masukkan panjang tinggi : ");
                        double tinggi2 = dita.nextDouble();
                        SegitigaSamaSisi samasisi = new SegitigaSamaSisi(alas2,tinggi2);
                        samasisi.view(alas2);
                }
        }
    }
    
}
