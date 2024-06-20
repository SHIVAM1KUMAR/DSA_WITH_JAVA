
import java.util.*;
public class AL {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(65);
        list.add(657);
        list.add(65);
        list.add(657);
        list.add(65);
        System.out.println(list.contains(657));
        list.set(0,99);
        list.remove(2);
        
        System.out.println(list);

        System.out.println("add new item");
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
    }
}
