/**********************************************
Workshop #3
Course:<subject type> - JAC444
Last Name:<Ahir Ahir>
First Name:< Devang >
ID:<153484209>
Section:<NCC>
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:<submission date>
**********************************************/


package task1;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    public GeometricObject(){
    this.color="White";
    this.filled=false;
    
    }
   public  GeometricObject(String color, boolean filled){
   this.color=color;
   this.filled=filled;
   }

    
    public String getColor() {
        return color;
    }

    
    public void setColor(String color) {
        this.color = color;
    }

    
    public boolean isFilled() {
        return filled;
    }

    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
