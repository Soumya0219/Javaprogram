import java.util.Scanner;

interface Mathematics{
    }
 class Addition implements Mathematics{
    int b=20;
    int c=6;
    int a;

    public void additionShow(){
       a=b+c;
    }
    public void subtractionShow(){
        a=b-c;
    }
    public void multiplicationShow() {
        a=b*c;
    }
    public void display(){
        System.out.println("a: " + (b+c) + "\na: " + (b-c) + "\na: " + (b*c));
    }
}
public class InterfaceDemo {
    public static void main(String args[]){
        Addition ad=new Addition();
        ad.additionShow();
        ad.subtractionShow();
        ad.multiplicationShow();
        System.out.println("The result is:" );
        ad.display();
}
}
