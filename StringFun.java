/**
*This class uses string functions which takes arguments and performs functions such
*as booleans, trimming, counting, finding the index, stating the character at a position
*and for my personal choice I chose for them to make the argument lower and uppercase.
@author Yousif
@version 1.0
**/
public class StringFun	{
	public static void main(String[] args){

		String s = args[0];
		String otherString = args[1];
		String subString = args[2];


		System.out.println(s.equals(otherString));
		System.out.println(s.substring(0, 4));
		System.out.println(s.trim());
		System.out.println(s.indexOf(subString));
		System.out.println(s.lastIndexOf(subString));
		System.out.println(s.charAt(3));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());


	}
}