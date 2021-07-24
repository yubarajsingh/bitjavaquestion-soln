import java.util.Scanner;
class CircleArea{
    
    
    public static void CalArea(double radius){
        double area=radius*radius*Math.PI;
        System.out.println("area of circle is "+ area);
    }
    public static void main(String args[]){
        System.out.println("find area of circle");
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of radius");
        float valuA=input.nextFloat();
        CalArea(valuA);
       

    }   
}