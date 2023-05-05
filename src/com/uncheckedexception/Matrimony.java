package com.uncheckedexception;

public class Matrimony {

	public static void main(String[] args) {
	int age=25;
	if(age<=30 && age>=25) {
	System.out.println("eligible");
	}else {
		try {
	throw new AgeInvalidException("not eligible");

	}catch(AgeInvalidException e) {
		System.out.println(e.getMessage());
	}

}
}
}
