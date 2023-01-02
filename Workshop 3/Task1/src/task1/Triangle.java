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

public class Triangle extends GeometricObject {
    public double side1;
    public double side2;
    public double side3;
    public Triangle(){
    super();    
    this.side1=1.0;
    this.side2=1.0;
    this.side3=1.0;
    
    }
     public Triangle(double side1,double side2, double side3,String color,boolean fill){
     super(color,fill);    
    this.side1=side1;
    this.side2=side2;
    this.side3=side3;
    
    }
    

    @Override
    public double getArea() {
       double s=(this.side1+this.side2+this.side3)/2;
       double s2=s*(s-this.side1)*(s-this.side2)*(s-this.side3);
       //System.out.println(s2);
       double area=Math.sqrt(s2);
       return area;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimeter() {
        return this.side1+this.side2+this.side3;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String toString(){
        
        StringBuilder s=new StringBuilder();
        s.append("Triangle").append(" ").append(" sides=").append(this.side1).append(",").append(this.side2).append(",").append(this.side3).append(" ").append("area=").append(this.getArea()).append(" ").append("perimeter=").append(this.getPerimeter()).append(" ").append("color=").append(this.getColor()).append(" ").append("filled=").append(this.isFilled());
    
    return s.toString();
    }
    
}
