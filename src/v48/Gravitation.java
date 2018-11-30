package v48;

public class Gravitation {

	public static void main(String[] args) {
		
		double massaPerson = 80;
		double massaJorden = 5.972 * Math.pow(10, 24);
		double radieJorden = 6378000;
		double gravitationsKonstant = 6.67408 * Math.pow(10, -11);
		double gravitation;
		
		System.out.printf("The force is = %f.2 N" , gravitationKraft(massaJorden, massaPerson, gravitationsKonstant));
		
		gravitation = gravitationsKraft(massaJorden, massaPerson, gravitationsKonstant, radieJorden,
				gravitationsKonstant) / massaPerson;
		
		System.out.printf("Jordens gravitationsacceleration är: %.2f m/s^2");
	}

		static double gravitationKraft(double massaJorden, double massaPerson, 
			double gravitationsKonstant) {
			
			double force;
			
			force = massaPerson * massaJorden * gravitationsKonstant/(Math.pow(radieJorden, 2));
		
			return force;
	}

	
	
}
