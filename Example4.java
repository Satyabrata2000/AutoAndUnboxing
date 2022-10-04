package AutoboxingAndUnboxing;

//Autoboxing and Unboxing with method overloading

public class Example4 {

    static void m(int i){
        System.out.println("int");
    }
    static void m(Integer i){
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        int s = 20;
        m(s);
    }
}
