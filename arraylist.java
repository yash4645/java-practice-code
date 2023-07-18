import java.util.*;
class arraylist{
    public static void main(String[] arg){
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(2));
        list.add(2,7);
        list.add(4,2);
        System.out.println(list);
        list.set(2, 4);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list);
       }
}