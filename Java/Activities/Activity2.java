package Activites;

import java.util.Arrays;

public class Activity2 {
    int[] numberArray ={10, 77, 10, 54, -11, 10};
    int expectedValue=0;
    String num=Arrays.toString(numberArray);
    public void arrayIteration(){
        for(int n: numberArray){
            if (n==10){
                expectedValue=expectedValue+n;
            }
        }
        if(expectedValue==30){
            System.out.println("Expected Value 30  matched with "+expectedValue);
        }else{
            System.out.println("Expected Value 30 not matched with "+expectedValue);
        }
    }

    public static void main(String[] args) {
        Activity2 a2=new Activity2();
        a2.arrayIteration();
    }
   ///for(String n:Arrays){}




}
