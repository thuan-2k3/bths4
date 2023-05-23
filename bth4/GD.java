/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth4;

import java.time.LocalDate;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class GD {
    private String Magd ;
    private double Dongia ;
    private double Dientich ;
    private String Ngaygd ;

    public GD() {
    }

    public GD(String Magd, double Dongia, double Dientich, String Ngaygd) {
        this.Magd = Magd;
        this.Dongia = Dongia;
        this.Dientich = Dientich;
        this.Ngaygd = Ngaygd;
    }

   

    public String getMagd() {
        return Magd;
    }

    public void setMagd(String Magd) {
        this.Magd = Magd;
    }

    public double getDongia() {
        return Dongia;
    }

    public void setDongia(double Dongia) {
        this.Dongia = Dongia;
    }

    public double getDientich() {
        return Dientich;
    }

    public void setDientich(double Dientich) {
        this.Dientich = Dientich;
    }

    public String getNgaygd() {
        return Ngaygd;
    }

    public void setNgaygd(String Ngaygd) {
        this.Ngaygd = Ngaygd;
    }

    
   

    @Override
    public String toString() {
        return "GD{" + "Magd=" + Magd + ", Dongia=" + Dongia + ", Dientich=" + Dientich + ", Ngaygd=" + Ngaygd + '}';
    }
     
     public void Nhap(){
         Scanner sc=new Scanner(System.in);
		System.out.print("Nhap ma giao dich:");
		Magd= sc.nextLine();
		System.out.print("Nhap dien tich:");
		Dientich= sc.nextInt();
		System.out.print("Nhap gia tri:");
		Dongia= sc.nextDouble();
                System.out.print("Nhap ma giao dich:");
		Ngaygd= sc.nextLine();
     }
}
