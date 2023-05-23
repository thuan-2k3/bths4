/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList< GDnha > AGDN = new ArrayList<>();
        ArrayList< GDdat > AGDD = new ArrayList<>(); 
         double tongtiengdd = 0;
         long tongtiengdn = 0;
         double tbthanhtien = 0 ;
        int SGDN = 0;
        int SGDD = 0;
        System.out.println("nhap so gd nha ");
        SGDN = sc.nextInt();
        System.out.println("nhap so gd dat ");
        SGDD = sc.nextInt();
        
        System.out.println("Nhap thong tin giao dich nha");
        for(int i = 0; i <= SGDN ; i++){
            System.out.println("Nhap thong tin giao dich thu" +(i+1)+":");
            GDnha giaodichn = new GDnha("");
            giaodichn.Nhap();
            AGDN.add(giaodichn);
        }
        System.out.println("Nhap thong tin giao dich dat");
        for(int i = 0; i <= SGDD; i++){
            System.out.println("Nhap thong tin giao dich thu" +(i+1)+":");
            GDdat giaodichd = new GDdat("");
            giaodichd.Nhap();
            AGDD.add(giaodichd);
        }
            System.out.println("Thong tin giao dich dat");
            for(int i=0; AGDD.size() >= i ;i++){
                System.out.println(AGDD.get(i).toString());  
        }
             System.out.println("Thong tin giao dich nha");
            for(int i=0; AGDN.size() >= i ;i++){
                System.out.println(AGDN.get(i).toString());  
        }
            for(int i=0; i<AGDD.size(); i++){
                if(AGDD.get(i).getLoaidat().equalsIgnoreCase("A")){
                  tongtiengdd += AGDD.get(i).getDongia()*1.5;
                } else if (AGDD.get(i).getLoaidat().equalsIgnoreCase("B")||
                      AGDN.get(i).getLoainha().equalsIgnoreCase("c") ) {
                    tongtiengdn += AGDN.get(i).getDongia();
                }
        }
          tbthanhtien = tongtiengdd/AGDD.size();
          System.out.println("xuat tb thanh tien cua gd ");
          
          System.out.println("cac gd dat nam 2023 ");
          for(int i = 0; i<AGDD.size(); i++){
              String [] dateGDdat = AGDD.get(i).getNgaygd().split("/");
              if(dateGDdat[1].equals("5") && dateGDdat[2].equals("2023")){
                  System.out.println(AGDD.get(i).toString());
              }
          }
           System.out.println("cac gd nha nam 2023 ");
          for(int i = 0; i<AGDN.size(); i++){
              String [] dateGDnha = AGDD.get(i).getNgaygd().split("/");
              if(dateGDnha[1].equals(3) && dateGDnha[2].equals("2023")){
                  System.out.println(AGDD.get(i).toString());
              }
          }
          
    }
}
