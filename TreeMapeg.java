package Practical.com.Collection;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapeg {
public static void main(String[] args) {
	TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
	map1.put(101, "Mango");
	map1.put(108, "Orange");
	map1.put(105, "Banana");
	map1.put(103, "Grapes");
	map1.put(105, "Banana");
	System.out.println(map1);
	map1.putIfAbsent(102, "CustardApple");
	map1.putIfAbsent(102, "Watermelon");
	System.out.println("-------------------");
	for(Map.Entry m:map1.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	map1.remove(103);
	System.out.println("-------------------");
	System.out.println("After removal");
	for(Map.Entry m:map1.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
}
