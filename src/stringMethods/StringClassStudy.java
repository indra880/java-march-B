package stringMethods;

public class StringClassStudy {

	public static void main(String[] args) 
	{
		String name = "velocity";// constant pool area
		String s = "velocity";
		
		
		String name1 = new String("velocity12345");// non constant pool area 
		String name2 = new String("velocity");
		String name3 = new String("Velocity");
		
		// use of length method
		System.out.println("length of strin is "+name.length());
		
		//stored in reference variable for future use
        int StringLength = name.length();
        System.out.println("length of string is "+StringLength);
        
        
        System.out.println(name1.length());
        
        //use of touppercase method
        System.out.println(s.toUpperCase());
		//stored in reference variable for future use
        String capitalletters = s.toUpperCase();
        System.out.println(capitalletters);
        
        //use of tolowercase
        
        System.out.println(capitalletters.toLowerCase());
        
        
        //use of equal method
        // == will compare memory locations
        System.out.println(name==s);//both name and s created without using new keyword
        System.out.println(name==name2);//name having memory in constant pool are and name2 having memory in non constant pool area
        
        //equal method use
       boolean result = name.equals(s);
       System.out.println(result);
       boolean result1 = name1.equals(name3);
       System.out.println(result1);
       System.out.println(name.equals(name3));//case sensitive
       System.out.println(name2.equalsIgnoreCase(name3));//this ignores case sensitive and just compare content
       System.out.println("++==================================================================");
       //use of contains method
      System.out.println(s.contains("v"));
      System.out.println(s.contains("V"));
      System.out.println(s.contains("cit"));//sequence of letter
     boolean result2 = s.contains("vi"); System.out.println(result2);
     System.out.println("===============================================================");
     //use of isempty method
     System.out.println(s.isEmpty());//length is zero then true
  // String m = null;//null pointer exception
    // System.out.println(m.isEmpty());
     String n="";
     String b=" ";
     System.out.println(n.length());
     System.out.println(n.isEmpty());
     System.out.println(b.isBlank());
     System.out.println("=====================================================================");
     //use of charAt method
     String city="pune";
     System.out.println(city.charAt(0));
     //System.out.println(city.charAt(4)); string index out of bound exception
     System.out.println("=============================================");
     //use of endsWith method
     System.out.println(city.endsWith("ne"));
     System.out.println(city.endsWith("ue"));
     System.out.println(city.endsWith("u"));
     System.out.println("=====================================");
     
     //use of starts with method
     System.out.println(city.startsWith("pu"));
     System.out.println(city.startsWith("ne"));
     System.out.println(city.startsWith("e"));
     System.out.println("=========================================");
  
     //study of substring method
     String str = "velocity corporate training centre";
     System.out.println(str.substring(9));
     System.out.println(str.substring(9, 18));
     System.out.println("===================================");
    
     //use of concat
     String a="velocityee ";
     String b1="pune";
     System.out.println(a.concat(b1));
     System.out.println(a.concat("corporate training centre"));
     String c=a.concat("corporate training centre");
     System.out.println(c);
     System.out.println("============================");
    
     //use of indexof method
     System.out.println(a.indexOf('e'));
     System.out.println(a.lastIndexOf('e'));
     System.out.println(a.indexOf('e',5 ));
     System.out.println("=================================");
    
     //use of replace method
     
     String state="maaharashtra";
     System.out.println(state.replace('a', 'n'));
     System.out.println(state.replace("ra", "mn"));
     System.out.println("========================================");
   
     //use of spilt method
     
 //    String pq="I love my India";
     
     String str1 = "@#$&&accenture";
     String result12 = str1.substring(5);
     System.out.println(result12);
     
     String str2="@#%$A&&ccenture";
    String result123 = str2.replaceAll("[^a-zA-Z0-9]","");
    System.out.println(result123);
    
     
     
     
       

	}

}
