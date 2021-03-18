import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]){
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(19);
        l.add(9);
        l.add(1);
        Iterator<Integer> iterator=l.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        LinkedList<String> li = new LinkedList<String>();
        li.add("d");
        li.add("c");
        li.add("b");
        li.addLast("a");
        li.addFirst("e");
        li.remove("c");
        System.out.println(li);
        Iterator<String> iterator1=li.iterator();
        while(iterator1.hasNext())
            System.out.println(iterator1.next());
        int a=li.size();
        System.out.println("The list size is:"+a);
    }
}
