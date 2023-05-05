package com.allprograms;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicatesRe {

public static void main(String[] args) {
String []name= {"c","java","java","html","css","sql"};
for(int i=0;i<name.length;i++) {
for(int j=i+1;j<name.length;j++) {
//if(name[i]==name[j]) {
//System.out.println(name[j]);
//}	
if(name[i].equals(name[j])) {
System.out.println(name[i]);
}
}
}
//using hashset it will stores unique values
Set<String> set=new HashSet();
for(String store:name) {
if(set.add(store)==false) {
System.out.println(store);
}
}
}
}