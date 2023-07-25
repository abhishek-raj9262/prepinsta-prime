package Arraylist;

import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(1);
        lis.add(2);
        lis.add(3);
        lis.add(4);
        lis.add(5);
        int max = Integer.MIN_VALUE;
        for (int i = lis.size()-1; i >= 0; i--) {
            if (lis.get(i) > max){
                max = lis.get(i);
            }

        }
        System.out.println(max);

    }
}
