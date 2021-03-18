interface Company{
    void show();
}
interface Process{
    void display();
}
interface Office extends Company,Process{
    void place();
}
public class MultipleInterface implements Office{
    public void show(){
        System.out.println("Company name is Ariatech");
    }

    @Override
    public void display() {
        System.out.println("Process is developer");
    }

    @Override
    public void place() {
        System.out.println("Located at Hi-tech city");
    }

    public static void main(String args[]){
        MultipleInterface mi=new MultipleInterface();
        mi.show();
        mi.display();
        mi.place();
    }
}
