/** 
 *@author Yuqi Max Zhang 
 *@classn_name CISC 190 
 */
public class RegularPolygon {
    //Fields decalartions
    private int n = 3;
    private double side = 1.0;
    private double x , y = 0.0;
    
    //Constructors
    public RegularPolygon(){}
    public RegularPolygon(int i, double d){
        n = i;
        side = d;
    }
    public RegularPolygon(int i, double d, double x1, double y1){
        this(i, d);
        x = x1;
        y = y1;
    }
    //Accessors
    public int getNumberSides(){
        return n;
    }
    public double getSideLength(){
        return side;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    //mutator
    public void setNumberSides(int i){
        n = i;
    }
    public void setSideLength(double d){
        side = d;
    }
    public void setX(double x1){
        x = x1;
    }
    public void setY(double y1){
        y = y1;
    }

    //Methods
    public double getPerimeter(){
        return n*side;
    }
    public double getArea(){
        return n*side*side/(4 * Math.tan(Math.PI/n));
    }

}
