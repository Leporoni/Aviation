package altimetry;

/**Calculation for the combined error of a
 * aircraft in flight. 
 * @AlexRocha
 */

import java.util.Scanner;

public class CombinedError {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double QNH, QNE, PE, PA, ISA, FL, T, TE, CE, TA;

		System.out.println("Altimetry - Altimeter Temperature Error and Pressure Correction ");
		System.out.println();
		System.out.println("ISA (International Standard Atmosphere)");
		System.out.println("Enter the pressure altitude: ");
		PA = input.nextDouble();
		ISA = 15 - (2 * PA) / 1000;
		System.out.printf("ISA in FL: %.0f degrees Celsius \n", ISA);
		System.out.println();

		System.out.println("Pressure Error");
		System.out.println("Enter the QNH ");
		QNH = input.nextDouble();
		QNE = 1013.2;
		PE = (QNH - QNE) * 30;
		System.out.printf("Pressure Error: %.0f feet \n ", PE);
		System.out.println();

		System.out.println("Temperature Error");
		System.out.println("Enter the FL ");
		FL = input.nextDouble();
		System.out.println("Enter the temperature in FL ");
		T = input.nextDouble();
		TE = (T - ISA) * 0.4 * FL;
		System.out.printf("Temperature error: %.0f feet \n ", TE);
		System.out.println();

		CE = PE + TE;
		System.out.printf("Combined error: %.0f feet \n ", CE);
		System.out.println();

		TA = PA + CE;
		System.out.printf("True aircraft altitude: %.0f feet \n ", TA);
		System.out.println();

		System.out.println("ALWAYS FLY SAFE");
		System.out.println("by Alex Rocha");

	}

}
