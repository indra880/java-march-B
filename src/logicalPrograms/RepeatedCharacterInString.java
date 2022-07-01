package logicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class RepeatedCharacterInString {

	public static void main(String[] args) 
	{
		String a="indindrajiits";
		
		HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for(int i=0;i<=a.length()-1;i++)
		{
			char charvalue = a.charAt(i);
			
			if(mp.containsKey(charvalue))
			{
				mp.put(charvalue, mp.get(charvalue)+1);
			}
			else
			{
				mp.put(charvalue, 1);
			}
		}
		//System.out.println(mp);
          Set<Character> keys = mp.keySet();
          for(Character key:keys)
          {
        	  System.out.println(key+" "+mp.get(key));
          }
	}

}
