//W.A.J.P to find all interleaving of given strings. 
//The given strings are: WX YZ 
//The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ

package com.assignment2;

public class Q12 
{
	public class InterleavingStrings
	{
	    public static void main(String[] args) 
	    {
	        String str1 = "WX";
	        String str2 = "YZ";

	        System.out.println("The given strings are: " + str1 + " " + str2);
	        System.out.println("The interleaving strings are:");
	        findAllInterleavings(str1, str2, "");
	    }

	    static void findAllInterleavings(String str1, String str2, String result)
	    {
	        if (str1.isEmpty() && str2.isEmpty())
	        {
	            System.out.println(result);
	            return;
	        }

	        if (!str1.isEmpty()) 
	        {
	            findAllInterleavings(str1.substring(1), str2, result + str1.charAt(0));
	        }

	        if (!str2.isEmpty()) 
	        {
	            findAllInterleavings(str1, str2.substring(1), result + str2.charAt(0));
	        }
	    }
	}


}
