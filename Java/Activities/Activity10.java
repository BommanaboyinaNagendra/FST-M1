package Activites;

import java.util.HashSet;
import java.util.Iterator;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hashset=new HashSet<>();
        hashset.add("set1");
        hashset.add("set2");
        hashset.add("set3");
        hashset.add("set4");
        hashset.add("set5");

        System.out.println(hashset.size());
        hashset.remove("set1");
        System.out.println(hashset.size());
        hashset.remove("set10");// not present in set
        System.out.println(hashset.size());

        System.out.println(hashset.contains("set2"));

       Iterator it= hashset.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }

    }


}
