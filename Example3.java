package AutoboxingAndUnboxing;

//Autoboxing and Unboxing with comparison operators
public class Example3 {

    public static void main(String[] args) {

        Integer i = new Integer(20);
        if(i < 50){  //Unboxing internally
            System.out.println(i);
        }
    }
}
