/** 
 *@author Yuqi Max Zhang 
 *@classn_name CISC 190 
 */
public class Main {
    public static void main(String[] args){
        RegularPolygon R1 = new RegularPolygon();
        RegularPolygon R2 = new RegularPolygon(6,4);
        RegularPolygon R3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Polygon 1 perimeter:" + R1.getPerimeter() + "\nPolygon 1 area: " + R1.getArea() + "\nPolygon 2 perimeter: " + R2.getPerimeter() + "\nPolygon 2 area: " + R2.getArea() + "\nPolygon 3 perimeter: " + R3.getPerimeter() + "\nPolygon 3 area: "+ R3.getArea());
    }
}
