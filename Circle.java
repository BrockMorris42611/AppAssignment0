public class Circle extends Shape{

    private double radius;

    public Circle(String name) {
        super(name);
    }
    public void setDimensions(double radius){
        this.radius = radius;
    }
    @Override
    public void printDimensions(){
        System.out.println("radius: " + this.radius);
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}
