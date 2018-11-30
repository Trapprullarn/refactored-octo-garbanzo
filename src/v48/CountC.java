package v48;

public class CountC {
	
	public static void main(String[] args) {
		System.out.println(count("Yeet",'e'));
	}
	
	public static int count(String str, char c) {
		
		int result = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)== c) {
				result++;
			}
		} return result;
	}
}
