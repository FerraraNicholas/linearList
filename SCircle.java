/*
 * A SCricle class for radius and area.
 */
package linearList;

/**
 *
 * @author NicholasFerrara
 */
class SCircle {
    
    String intro;
    double radius;
    double area = getArea(radius);
    
    public SCircle (double radius){
        intro = ("< SCricle = " + radius + " >");
        
    }

    public double getArea(double radius) {
        double area;
        area = (3.14) * (radius * radius);
        return area;
    }
    
    public String toString(){
        return intro;
    }
    
    
    
}
