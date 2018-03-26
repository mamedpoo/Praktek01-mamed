/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01.mamed;

/**
 *
 * 
 */
public class jamtanganaksi {
    public static void main(String[] args) {
        
        JamTangan A = new JamTangan();
        JamTangan B = new JamTangan();
        JamTangan C = new JamTangan();
        

        A.TaliJam="Karet";
        A.JenisJam="Digital";
        A.Merk="Armagethon";
        A.Bahan="Steanlessstell";
        A.ThnPmbuatan="2011";

        B.TaliJam="Kulit";
        B.JenisJam="Analog";
        B.Merk="Swiss Army";
        B.Bahan="Plastik";
        B.ThnPmbuatan="1998";

        C.TaliJam="Besi";
        C.JenisJam="SmartWatch";
        C.Merk="AppleWatch";
        C.Bahan="Kayu";
        C.ThnPmbuatan="2018";
        
        
         
         A.MenampilkanWaktu();
        System.out.println();
         B.MenampilkanWaktu();
        System.out.println();
         C.MenampilkanWaktu();

    }
}