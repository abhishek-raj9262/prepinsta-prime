package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Practice {
    public static long findMinDiff (ArrayList<Integer> list, int n, int m)
    {
        Collections.sort(list); //first we sort the array
        int min = Integer.MAX_VALUE;
        for(int i =0; i+m-1<n;i++){
            int diff = list.get(i+m-1)-list.get(i);
            if(diff < min ) {
                min =  diff;
            }
        }
        return min;


    }
    public static void main(String[] args) {

    }
}




