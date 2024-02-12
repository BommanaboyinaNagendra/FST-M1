package Activites;

import java.util.ArrayList;
import java.util.Iterator;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("name1");
        arrayList.add("name2");
        arrayList.add("name3");
        arrayList.add("name4");
        arrayList.add("name5");

        for(String s:arrayList){
            System.out.println(s);
        }
        arrayList.get(3);
        System.out.println("3rd element "+arrayList.get(3));


        System.out.println("Checking element "+arrayList.contains("name3"));

        System.out.println("Size of elements "+arrayList.size());

        arrayList.remove(3);
        System.out.println("Size of elements "+arrayList.size());
        Iterator it=arrayList.iterator();
        while (it.hasNext()){
            System.out.println("elements after remove "+it.next());
        }
        



    }
}
