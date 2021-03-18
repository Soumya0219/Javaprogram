import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=1;i<=7;i++)
            al.add(i);
        System.out.println(al);
        al.remove(4);
        System.out.println(al);
       ArrayList<String> as=new ArrayList<String>();
       as.add("soumya");
       as.add("thota");
       as.add("abc");
       as.add("eee");
       Collections.sort(as);
       for(String s:as)
        System.out.println(s);
       int a=al.size();
       System.out.println("The array size is:" +a);
    }
}
