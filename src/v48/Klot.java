package v48;

public class Klot {

	public static void main(String[] args) {
		System.out.println(volume(2));
	}
	public static double volume(double radius) {
		return(4*Math.PI*Math.pow(radius, 3))/3;
	}
}
