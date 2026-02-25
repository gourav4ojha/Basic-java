package ClassString;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome";
		String s1 = "welcome";
		String s2 = new String("welcome");
		System.out.println(str.length()); // 7
		
		System.out.println(str==s1); //true
		System.out.println(str==s2); //f
		System.out.println(str.equals(s2)); //t
		System.out.println(str.equals(s1)); //t
		
		System.out.println(str.equalsIgnoreCase("Welcome")); // true  it will ignore the case
		
		System.out.println(str.toLowerCase()); //welcome 
		System.out.println(str.toUpperCase()); //WELCOME
		
		System.out.println(str.concat(" java")); // welcome java
		String ans = str + " "+ 23+ "Gourav";
		System.out.println(ans);
		System.out.println(str); // welcome b/c original string will not modify b/c string is immutable
		
		System.out.println(str.charAt(2)); // l this method is used to return the character for given the index 
		
		System.out.println(str.indexOf('e')); // 0 used to return the index of given character 
		System.out.println(str.indexOf('w',3));  // -1
		System.out.println(str.indexOf('w',1,4));  // -1
		System.out.println(str.lastIndexOf('e'));  // 6  this method is used to return index last acurance of the character
	
		System.out.println(str.contains(s1));  // this method are used to check weather the string is present or not return type boolean
		
		System.out.println(str.isEmpty());  // " " ,  "\\t\\n"(white space)   will return false
		System.out.println(str.isBlank());  //" " , will return  true
		
		System.out.println(str.startsWith("Welcome")); // false b/c case sensetive 
		System.out.println(str.endsWith("Welcome")); 
		
		System.out.println(str.repeat(3)); // print welcome 3 times
		
		String st1 = " w elco me ";
		System.out.println(st1.strip()); //  "w elco me" strig method are used to remove space from begining and ending
		System.out.println(st1.stripLeading()); // "w elco me "
		System.out.println(st1.stripTrailing()); // " w elco me"
		
		String s = "12nbd+fhih5+gff4igh-54nfj/jfj9";
		System.out.println(s.replaceAll("[^0-9*+/-]", "")); // "12+5+4-54/9"
		System.out.println(s.replaceAll("[0-9*+/-]", "")); // "12+5+4-54/9"
		System.out.println(str.replace("el", "r"));  // wescome
		
		System.out.println(str.substring(3,4)); // return c  -this method are used to extract Some portion of character for given the index
		System.out.println(str.substring(2)); 

		String a= "abc";
		String b= "bcd";
		String c="Elifnt";
		System.out.println(a.compareTo(b)); // -1 return negative value only b/c a comes before b
		System.out.println(b.compareTo(a));  // 1 return negative value only b/c a comes before b
		System.out.println(str.compareTo(c)); // 50 return negative value only b/c a comes before E case sencitive 
		
		String st="23456";
		System.out.println(Integer.parseInt(st)); //23456
		System.out.println(Integer.valueOf(st));  //23456
		System.out.println(Long.parseLong(st));  //23456
		System.out.println(Double.parseDouble(st)); //23456.0
		
        String st5 = "[1,4,6,78,90,45]";
        st5 = st5.replace("[", "").replace("]", "");
        System.out.println(st5);
		

	}

}
