/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assimenet2;

/**
 *
 * @author s4350
 */
public class Assimenet2 {

   
    public static void main(String[] args) {
        Mammals e = new Cow("Red Argus","Canda","lama",15,"red","F");
      
        
       e.Food_amount();
       e.NumberOfMammryGlands();
       e.setKind("Red Argus");
       e.setLocation("Canda");
       
       

       
        System.out.println(e);
    }
    
}
