package com.tns.ifet.day1;

public class SwitchDemo {

	public static void main(String[] args) {
		char x='l';
		switch(x)
		{
		case'l':
		case'L':
			System.out.println(x +" "+"is a Letter");
			break;
		case'd':
		case'D':
			System.out.println(x+"is a Digit");
		case'w':
		case'W':
			System.out.println(x+"is a White Space");
		
		case's':
		case'S':
			System.out.println(x+"is Special");
		default:
			System.out.println(x+"is other than letter,digit,space or special symbol");
			break;
		}
			
		

	}

}
