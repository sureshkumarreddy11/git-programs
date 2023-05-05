package com.jsp.iterator;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) {
    Map m=new HashMap();
    System.out.println(m.put("a", 10));
    System.out.println((m.put("a", 20)));
    System.out.println((m.get("a")));
    System.out.println(m.containsValue("a"));
    System.out.println("size of="+m.size());
    

	}

}
