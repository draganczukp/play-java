package pl.killermenpl.util;

public class StringUitls {
	public static boolean isEmpty(String s){
		return s==null || s.equals("") || s.equalsIgnoreCase("");
	}
}
