
package bangunruang;

public class limasSegitiga extends BangunRuang{
    float a;
    float ts;
    float tl;
    float tst;
    
    @Override
    float volume(){
      float volume =  tl*(a*ts*1/2)*1/3;
        System.out.println("volume limas segitiga: " + volume);  
        return volume;
    }
    @Override
    float luasPermukaan(){
      float luasPermukaan = (3*(a*tst*1/2)) + a*ts*1/2 ;
        System.out.println("Luas permukaan limas segitiga : " + luasPermukaan);  
        return luasPermukaan;
    }
}
