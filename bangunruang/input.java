
package bangunruang;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        BangunRuang BangunRuang = new BangunRuang();
        
        Bola Bola = new Bola();
            System.out.print("Masukkan r bola: ");
            Bola.r = scanner.nextFloat();
            
            kubus kubus = new kubus();
            System.out.print("Masukkan s kubus: ");
            kubus.s = scanner.nextFloat();
            
            balok balok = new balok();
            System.out.print("Masukkan p balok: ");
            balok.p = scanner.nextFloat();
            System.out.print("Masukkan l balok: ");
            balok.l = scanner.nextFloat();
            System.out.print("Masukkan t balok: ");
            balok.t = scanner.nextFloat();
            
            limasSegitiga limasSegitiga = new limasSegitiga ();
            System.out.print("masukkan a limas segitiga: ");
            limasSegitiga.a = scanner.nextFloat();
            System.out.print("masukkan ts limas segitiga: ");
            limasSegitiga.ts = scanner.nextFloat();
            System.out.print("masukkan tl segitiga: ");
            limasSegitiga.tl = scanner.nextFloat();
            System.out.print("masukkan tst segitiga: ");
            limasSegitiga.tst = scanner.nextFloat();
            
            BangunRuang.volume();
            BangunRuang.luasPermukaan();
            
            Bola.volume();
            Bola.luasPermukaan();
            
            kubus.volume();
            kubus.luasPermukaan();
            
            balok.volume();
            balok.luasPermukaan ();
            
            limasSegitiga.volume();
            limasSegitiga.luasPermukaan();
            
        
    }
    
}
