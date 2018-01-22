package warmup02;
// 1. declare an array variable consisting of 3 Student objects
// 2. print all students object to the console using "for" and "foreach" style

public class TestStudent {

    public static void main(String[] args) {
        Student[] std = new Student[3] ;
        std[0] = new Student("hong");
        std[1] = new Student("bew");
        std[2] = new Student("tiny");
        
        for(Student print : std){
            System.out.println(print);
        } 
        System.out.println();
        for(int i=0 ; i<std.length;i++){
            System.out.println(std[i]);
        }
        
    
    }

}
