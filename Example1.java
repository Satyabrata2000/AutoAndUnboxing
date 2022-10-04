package AutoboxingAndUnboxing;

//Autoboxing
public class Example1 {

    public static void main(String[] args) {

        int a = 40;
        Integer b = new Integer(a); //Boxing
        Integer c = 10; //Boxing
        System.out.println(b + " " + c);
    }
}
