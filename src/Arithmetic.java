public class Arithmetic {
    public static void main(String args[]){
        try {
            int a = 30, b = 0, c = a / b;

            System.out.println(+c);
        } catch(ArithmeticException e){
            System.out.println("Can not divide by a number 0");
        }
    }
}
