package bangunruang;

public class Bola extends BangunRuang{
    float r;
    
    @Override
     float volume(){
      float volume = (float) (Math.PI * r * r * r)*4/3;
        System.out.println("volume bola: " + volume);  
        return volume;
     }
     
    @Override
       float luasPermukaan(){
         float luasPermukaan = (float) (4*Math.PI*r*r);
        System.out.println("luas permukaan bola: " + luasPermukaan);
        return luasPermukaan;
        
       }          
}
