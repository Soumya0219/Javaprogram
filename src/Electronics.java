public class Electronics {
    void details(){
        System.out.println("Tv costs Rs.30000");
    }
}
class TV extends Electronics{
    void details(){
        System.out.println("Tv is about 32 inches");
    }
}
class Cost{
    public static void main(String args[]){
        Electronics ec=new TV();
        ec.details();
    }
}
