package Activites;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int[] data = { 9, 5, 1, 4, 3 };
        for(int n:data){
            System.out.print(n);
        }
        Arrays.sort(data);
        System.out.println(" ");
        for(int n:data){
            System.out.print(n);
        }
        //System.out.println(Arrays.sort(data));
    }
}
