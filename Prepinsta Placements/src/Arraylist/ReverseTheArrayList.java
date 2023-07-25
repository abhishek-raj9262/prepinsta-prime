package Arraylist;

import java.util.ArrayList;

public class ReverseTheArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(1);
        lis.add(2);
        lis.add(3);
        lis.add(4);
        lis.add(5);
        for (int i = lis.size()-1; i >= 0; i--) {
            System.out.println(lis.get(i));

        }

    }
}
