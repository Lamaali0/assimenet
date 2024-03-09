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
public abstract class Mammals implements Animal{
    protected String kind;
    protected String location;

    public Mammals() {
    }

    public Mammals(String kind, String location) {
        this.kind = kind;
        this.location = location;
    }
    
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public abstract int NumberOfMammryGlands();
     
     public abstract String Food_amount();
    
    @Override
    public String toString() {
        return "Mammals{" + "kind=" + kind + ", location=" + location + '}';
    }
    
    
    
}
