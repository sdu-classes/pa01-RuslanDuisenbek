package object.OOP1;

public class Circle {
    double radius=1.0;
    public Circle(double radius){
        this.radius=radius;

    }
    public Circle(){

    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){


        return 2*Math.PI*radius;

    }
    public String toString(){
        return "Circle[radius="+radius+"]";
    }
}
