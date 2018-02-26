package lecture6;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public final String getColor() {
        return color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    
    @Override
    public String toString() {
        return "\tColor : " + color;
    }
    
}
