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
public class Cow extends Mammals  {
    protected String Name;
    protected int Age;
    protected String color;
    protected String gender;

    public Cow() {
    }

    public Cow(String kind,String location,String Name, int Age, String color, String gender) {
        super(kind, location);
        this.Name = Name;
        this.Age = Age;
        this.color = color;
        this.gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
  
    @Override
    public int NumberOfMammryGlands() {
        return (5);
        
    }

    @Override
    public String Food_amount() {
        return ("10 kilo per day from corn container");
        
        
    }

    @Override
    public String toString() {
        return "kind=" + kind + "location=" + location+ "Name=" + Name + ", Age=" + Age + ", color=" + color + ", gender=" + gender + '}';
    }

   

    

    
    
    
}
