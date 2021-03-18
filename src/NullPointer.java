public class NullPointer {
    public static void main(String args[]){
        String s=null;

        try{
            if("aa".equals(s))
                System.out.println("equal");
            else
                System.out.println("Not Equal");
             if(s.equals("aa"))
                System.out.println("Equal");
             else
                 System.out.println("Not Equal");
        } catch (NullPointerException e) {

            System.out.println("Null Pointer");
        }
    }
}
