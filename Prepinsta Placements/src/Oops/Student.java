package Oops;

public class Student {
    String name;
   private final int roll; // private - only access within the same class
    private static int count; //here we count how many objects are created

    //create a getter for count
    public static int getCount() {
        return count;
    }

    // we access student class roll properties in private access modifier we use here getter and setter
    public void setRoll(int roll) { // here we add functionality for my student class in this we set our priority
          if (roll <= 0){
              return;
          }
        //this.roll = roll; //when we assign a final keyword it throws an error because when we use final keyword it means once the roll number is assign no that is final roll number and it will not change anywhere in the code
    }

    public int getRoll() { // here we add functionality for my student class
        return roll;
    }

    /*constructor
     now we see that use of constructor */
    //create a custom constructor

    public Student(String name,int roll){ //syntax of constructor class name and constructor name are always same
        this.name = name;
        this.roll = roll;
        count++;
        //note - we create multiple constructor
    }
    //add more functionality in our student class
    public void print(){
        System.out.println(name +" : " + roll);
    }
}
