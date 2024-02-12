package Activites;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"red");
        map.put(2,"green");
        map.put(3,"yellow");
        map.put(4,"orange");
        map.put(5,"pink");

        System.out.println(map);

        System.out.println(map.containsValue("green"));

        System.out.println(map.size());



    }
}
