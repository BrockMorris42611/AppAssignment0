public class EquilateralTriangle extends Triangle {

    private double side;

    public EquilateralTriangle(String name) {
        super(name);
    }
    public void setDimensions(double side){
        this.side = side;
    }
    @Override
    public void printDimensions(){
        System.out.println("side: " + this.side);
    }
    @Override
    public double getArea(){
        double s = 3 * side * .5;
        return Math.sqrt(s * Math.pow(s-this.side, 3));
    }
}
