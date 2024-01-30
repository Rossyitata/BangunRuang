
package bangunruang;

public class balok extends BangunRuang{
    float p;
    float l;
    float t;
    
    @Override
    float volume(){
      float volume =  p * l * t;
        System.out.println("volume balok: " + volume);  
        return volume;
     }
    @Override
    float luasPermukaan(){
      float luasPermukaan = 2*p*l + 2*p*t + 2*l*t;
        System.out.println("Luas permukaan balok : " + luasPermukaan);  
        return luasPermukaan;
                }
}
