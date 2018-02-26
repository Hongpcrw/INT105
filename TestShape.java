package lecture6;


public class TestShape {
    public static void main(String[] args) {
        Object shape01 = new Circle(10);
        Object shape02 = new Rectangle(10, 20);
        Object shape03 = new Circle(10);
        Object shape04 = new Rectangle(10,20);
        System.out.println(shape01.toString());
        System.out.println("\n"+shape02.toString());
        
        Circle temp = (Circle)shape01;
        System.out.println("\n"+".getArea = "+temp.getArea());
        System.out.println("\nShape01 = Shape03? (.equals) : "+shape01.equals(shape03));
        System.out.println("Shape01 = Shape03? : "+(shape01==shape03));
        
        System.out.println("\nShape02 = Shape04? (.equals) : "+shape02.equals(shape04));
        System.out.println("Shape02 = Shape04? : "+(shape02==shape04));
//        System.out.println(((Circle)shape01).getArea());
//        System.out.println(shape01.color);
//        System.out.println(shape01.getColor());
    }
}
