import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Arraylist
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(8787);
        list.add(76768);
        list.add(989);
        list.add(3822);
        list.add(85855);

        System.out.println(list);
        list.set(0,99);
        list.remove(2);
        System.out.println(list);

    }
}
