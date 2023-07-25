package Arraylist;

import java.util.ArrayList;

public class SwapArrayList {
    static void swap(ArrayList<Integer> list){
        int temp = list.get(1);
        list.set(1,list.get(3));
        list.set(3,temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(1);
        lis.add(2);
        lis.add(3);
        lis.add(4);
        lis.add(5);
        System.out.println(lis);
        swap(lis);
        System.out.println(lis);

    }
}
