package lecture6;

public final class Circle extends Shape{
    private double radius;
    private String color;

    public Circle(double radius) {
        super("White");
        this.radius = radius;
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    
    
    @Override
    public String toString() {
        return "Circle " + "\n radius: " + radius + "\t Area : " + this.getArea()+super.toString();
    }
    
    public boolean equals (Object obj){
        boolean result = false;
        if(obj != null && obj instanceof Circle){
            Circle temp = ((Circle)obj);
            if(this.radius == temp.getRadius()){
                 result = true;
            }       
        }
        return result;
    }
    
    @Override
    public double getPerimeter() {
        return Math.PI*Math.pow(radius, 2);
    }
}
    

