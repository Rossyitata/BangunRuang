
package bangunruang;


public class kubus extends BangunRuang{
    float s;
    
    @Override
     float volume(){
      float volume =  s*s*s;
        System.out.println("volume kubus: " + volume);  
        return volume;
     }
     
    @Override
      float luasPermukaan(){
      float luasPermukaan = 6*s*s;
        System.out.println("Luas permukaan kubus : " + luasPermukaan);  
        return luasPermukaan;
      }
}
