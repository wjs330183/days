package test;

import java.util.concurrent.locks.ReentrantLock;

public class test {
	public static void main(String[] args) {
		
		String str = "   ";
		int a = lengthOfLastWord(str);
		System.out.println(a);
		
	}
    public static int lengthOfLastWord(String s) {
    	if(s.split(" ").length != 0){
    	String[] str = s.split(" ");
    	int last = str.length;
    	int lastnum = str[last-1].length();
		return lastnum;
    	}
    	return 0; 
    }

	public static class Single {
	}
}
