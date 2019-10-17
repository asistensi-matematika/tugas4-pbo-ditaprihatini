/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class BangunDatar {
    protected String Jenis;
    
    public void view(){
        System.out.print("Nama bangun datar adalah ");
    }
}

class Persegi extends BangunDatar{
    protected double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    public double Luas(double sisi){
        double Luas = Math.pow(sisi,2);
        return Luas;
    }
    
    public double Keliling(double sisi){
        double Keliling = 4*sisi;
        return Keliling;
    }
    
    public void view(){
        double l = Luas(sisi);
        double k = Keliling(sisi);
        super.view();
        System.out.println("persegi");
        System.out.println("Luas perseginya adalah "+l+" cm^2");
        System.out.println("Keliling perseginya adalah "+k+" cm");
    }
}

class Lingkaran extends BangunDatar{
protected double jari2;

public Lingkaran(double jari2){
    this.jari2 = jari2;
}

public double Luas(double jari2){
    double Luas = 3.14*(Math.pow(jari2, 2));
    return Luas;
}

public double Keliling(double jari2){
    double Keliling = 2*3.14*jari2;
    return Keliling;
}

public void view(){
    double l = Luas(jari2);
    double k = Keliling(jari2);
    super.view();
    System.out.println("lingkaran");
    System.out.println("Luas lingkarannya adalah "+l+" cm^2");
    System.out.println("Keliling lingkarannya adalah "+k+" cm");
}
}

class Segitiga extends BangunDatar{
    protected double Alas;
    protected double Tinggi;
    
    public Segitiga(double Alas, double Tinggi){
        this.Alas = Alas;
        this.Tinggi = Tinggi;
    }
    
    public double Luas(double Alas, double Tinggi){
        double Luas = (Alas*Tinggi)/2;
        return Luas;
    }
    
    public void view1(double Alas, double Tinggi){
        double l1 = Luas(Alas,Tinggi);
        super.view();
        System.out.println("segitiga");
        System.out.println("Luas segitiga adalah "+l1+" cm^2");
    }
    
    public void view2(double Alas){
        double l2 = Luas(Alas, Tinggi);
        super.view();
        System.out.println("segitiga");
        System.out.println("Luas Segitiga adalah "+l2+" cm^2");
    }
}

class SegitigaSiku2 extends Segitiga{
    
    public SegitigaSiku2(double Alas, double Tinggi){
        super(Alas,Tinggi);
    }
    
    public double SisiMiring(double Alas, double Tinggi){
        double SisiMiring = Math.sqrt(Math.pow(Alas,2)+Math.pow(Tinggi,2));
        return SisiMiring;
    }
    
    public double Keliling(double Alas, double Tinggi){
        double SisiMiring = SisiMiring(Alas,Tinggi);
        double Keliling = Alas+Tinggi+SisiMiring;
        return Keliling;
    }
    
    public void view(double Alas,double Tinggi){
        double k1 = Keliling(Alas,Tinggi);
        super.view1(Alas,Tinggi);
        System.out.println("Jenis segitiganya adalah Segitiga Siku-Siku");
        System.out.println("Keliling segitiganya adalah "+k1+" cm");
    }
}    
class SegitigaSamaSisi extends Segitiga{
    
    public SegitigaSamaSisi(double Alas,double Tinggi){
        super(Alas,Tinggi);
    }
    
    public double Keliling(double Alas){
        double Keliling = 3*Alas;
        return Keliling;
    }
    
    public void view(double Alas){
        double k2 = Keliling(Alas);
        super.view2(Alas);
        System.out.println("Jenis Segitiganya adalah Segitiga Sama Sisi");
        System.out.println("Keliling segitiganya adalah "+k2+" cm");
    }
}
