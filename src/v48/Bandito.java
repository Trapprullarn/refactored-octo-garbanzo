package v48;

public class Bandito {
	public static void main(String[] args) {
		System.out.println(bandito("yeet"));
	}
	public static String bandito(String str){
        char konsonant[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'w', 'v', 'z', 'x' };
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            boolean found = false;
            for(int j = 0; j < konsonant.length; j++) {
                if(str.charAt(i) == konsonant[j]) {
                    found = true;
                    break;
                }
            }

            if(found) {
                result += (str.charAt(i) + "o" + str.charAt(i));
            }
            else {
                result += str.charAt(i);
            }

        }
        return result;
	}
}
