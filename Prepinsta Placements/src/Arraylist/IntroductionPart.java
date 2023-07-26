package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class IntroductionPart {
    public static void main(String[] args) {
        //ArrayList is the collection framework of java and we create any primitive ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Double> list4 = new ArrayList<>();

        /*
        operations on Arraylist
        1.add element - 0(1) = time complexity
        2.get element- 0(1)= time complexity
        3.remove element- 0(n)= time complexity
        4.set element at index- 0(n)= time complexity
        5.contains element- 0(n)= time complexity

         */
        //1. add
        list1.add(1); // time complexity for add function = 0(1)
        list1.add(2);// time complexity for add function = 0(1)
        list1.add(3);// time complexity for add function = 0(1)
        list1.add(1,23); /*by the help of this add operation we can add element
                                        with existing value example - initially we have  1,2,3 but after
                                        use this aDD operation now the arraylist will be 1,23,2,3
              now the time complexity will be  0(n)                                                                 */
        System.out.println(list1);
        //2.get element
        System.out.println(list1.get(2));
        //3. remove or delete element from the list
        list1.remove(2);
        System.out.println(list1);
        //set element
        list1.set(1,3);
        System.out.println(list1);
        //contains operation - it check whether the given number is present in arraylist or not
        Boolean ans = list1.contains(1);
        Boolean ans2 = list1.contains(5);
        System.out.println(ans);
        System.out.println(ans2);
        //another way to perform contains operation in single line
        System.out.println(list1.contains(1));
        //print the arraylist 
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

            /*sort the arraylist in java
            if we sort the list we use collections.sort() method class firstly we import the class in our main class
             * Collection vs Collections* Collection is interface and Collections are class
             in array there is array.sort() method for sort the array
             Note - when we sort the list or array via array.sort() or Collections.sort() method they sort
             in the ascending order but if we want to sort Arraylist in descending order we use Collections.sort(list,Collections.reverseOrder())*/
            Collections.sort(list1);//sort the list in ascending order
            Collections.sort(list1,Collections.reverseOrder());//sort the list in descending order
            //here Collections.reverseOrder() are the comparator - jo functions logic hote hai.

        }

    }
}
