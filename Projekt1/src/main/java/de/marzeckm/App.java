package de.marzeckm;

import java.util.*;
/**
 * Buchstaben werden groß ausgegeben
 *
 */
public class App 
{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String text = s.next();
		System.out.println(text.toUpperCase());
	}
}
