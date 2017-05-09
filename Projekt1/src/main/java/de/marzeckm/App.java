package de.marzeckm;

import java.util.*;
/**
 * Programm liest String ein. Der String wird Uppercase ausgegeben.
 *
 */
public class App 
{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String text = s.next();
		System.out.println(text.toUpperCase());
	}
}
