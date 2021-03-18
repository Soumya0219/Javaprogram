public class ClassNotFound {
    public static void main(String args[]){
        try{
            Class.forName("class not found");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
