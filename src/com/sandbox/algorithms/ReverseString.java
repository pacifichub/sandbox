package com.sandbox.algorithms;

public class ReverseString {
	
	static String reverseWORecursion(String s){
		
		if(s == null || s.isEmpty() || s.length() == 1)
			return s;
			
		StringBuilder db = new StringBuilder();
		
		for(int i=s.length() - 1; i>=0 ; i--){
			db.append(s.charAt(i));
		}
		
		return db.toString();
	}
	
	static String reverseWithRecursion(String s){
		if(s == null || s.isEmpty() || s.length() == 1)
			return s;
		
		
		
		return s.charAt(s.length() -1) + reverseWithRecursion(s.substring(0,s.length() -1));
	}
	
	static String reverseWithoutTempVariables(String s){
		int l = s.length();
		for(int i= l-1; i>=0; i--){
			s += s.charAt(i);
		}
		
		s = s.substring(l);
		return s;
	}
	
	static String reverseInPlace(String aStr){
        
        char[] charbuf = aStr.toCharArray();
         
        for(int i = charbuf.length - 1, j = 0; i > j; i--,j++ ) {
             
        	System.out.println("ReverseString.reverseInPlace() i="+i+" j="+j);
            if( charbuf[i] == charbuf[j]) {
                continue;
            }
             
            char temp = charbuf[i];
            charbuf[i] = charbuf[j];
            charbuf[j] = temp;      
        }
         
        return new String(charbuf);      
    
	}
	
	public static void main(String[] args) {
		System.out.println("ReverseString.main() NORC "+reverseWORecursion("Hello Me"));
		System.out.println("ReverseString.main() NORC "+reverseWithRecursion("de"));
		System.out.println("ReverseString.main() NORC "+reverseWithoutTempVariables("TellMe"));
		System.out.println("ReverseString.main() NORC "+reverseInPlace("InPlace"));
	}

}
