public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name) {

        super(name);
    }
    public void setDimensions(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public void printDimensions(){
        System.out.println("side1: " + this.side1 + "\nside2: " + this.side2 + "\nside3: " + this.side3);
    }
    public double getArea(){
        double s = (side1 + side2 + side3) * .5;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }
}
