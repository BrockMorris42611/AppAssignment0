public class Square extends Shape{

    private double length;
    private double height;

    public Square(String name) {
        super(name);
    }
    public void setDimensions(double length, double height){
        this.length = length;
        this.height = height;
    }
    @Override
    public void printDimensions(){
        System.out.println("length: " + this.length + "\nheight: " + this.height);
    }
    public double getArea(){
        return this.length * this.height;
    }
}
