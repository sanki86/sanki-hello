package test;

public class test {
	public static void main(String[] args) {
		String abc ="ABCDEF";
		
		StringBuilder build = new StringBuilder();
		build.append(abc);
		build.reverse();
		System.out.println("reverse string is "+build);
		
	}
}
