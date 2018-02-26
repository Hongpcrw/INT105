package lecture6;


public class Rectangle extends Shape{
    private double width;
    private double high;

    public Rectangle(double width, double high) {
        super("White");
        this.width = width;
        this.high = high;
    }

    public Rectangle(String color, double width, double high) {
        super(color);
        this.width = width;
        this.high = high;
    }
  
    public double getArea(){
        return this.high*this.width;
    }

    @Override
    public String toString() {
        return "Rectangle " + "\n width : " + width + "\t high : " + high + "\t"+"Area : "+this.getArea()+super.toString();
    }
        public boolean equals (Object obj){
        boolean result = false;
            if (obj != null && obj instanceof Rectangle) {
                Rectangle temp = ((Rectangle)obj);
                if (this.getArea() == temp.getArea()) {
                    result = true;
                }
        }
        return result;
    }
        
    @Override
    public double getPerimeter() {
        return (this.high*this.width)*2;
    }
}
