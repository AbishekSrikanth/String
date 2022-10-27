package org.string;

public class Stringsss {
public static void main(String[] args) {
	String s ="Welcome to Java";
	String s1 ="  welcome to java  ";
	
	
	int leng= s.length();
	System.out.println("Length is : "+leng);
	
	boolean equ= s.equals(s1);
	System.out.println("Equal "+equ);
	
	boolean equio= s.equalsIgnoreCase(s1);
	System.out.println("Equal ignore case : "+equio);
	
	boolean con= s.contains("j");
	System.out.println("Contains : "+con);
	
	String trm=s.trim();
	System.out.println("Trim : "+trm);
	
	int indof=s.indexOf("t");
	System.out.println("IndexOf : "+indof);
	
	int lstind=s.lastIndexOf("j");
	System.out.println("Last IndexOf : "+lstind);
	
	String toup=s.toUpperCase();
	System.out.println("To Uppercase : "+toup);
	
	String tolow=s1.toLowerCase();
	System.out.println("To Lowercase : "+tolow);
	
	boolean start=s.startsWith("w");
	System.out.println("Startswith : "+start);
	
	boolean end=s.endsWith("ava");
	System.out.println("Ends with : "+end);
	
	char chat=s.charAt(5);
	System.out.println("Char At : "+chat);
	
	String subs=s.substring(1,8);
	System.out.println("Substring : "+subs);
	
	String rep=s.replace("java","html" );
	System.out.println("Replace : "+rep);
	
	int compto=s.compareTo(s1);
	System.out.println("Compare to : "+compto);
	
	
}
	
}


