// Calculate ROI Program
// Ben Merritt
// CPT 307 Data Structures & Algorithms
// Dr Tina Tian
// September 5, 2022
// Input required for assignment
// CISCO 2900 Series Router C2921-VSEC/K9 Integrated Services Router
// Gain $1200 Cost $3965.99
// Ubiquiti ERPOE-5 EdgeRouter PoE Advanced 5-Port Router
// Gain $1073 Cost $800
// Adtran 4243908F1 Network Equipment
// Gain $1150 Cost $1973.99
// Additional input to show added item is sorted and displayed with rest of list
// Orbi 960 Series Quad-Band WiFi 6E Mesh System 10.8Gbps Router
// Gain $2195.99 Cost $1499.99

// Collections holds all the collection classes and interfaces used to sort
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

// Main class CalculateROI
public class CalculateROI {

	/**
	 * @param args
	 */
	// Main program
	public static void main(String[] args) {
		// Creating a linked list to place all input
		LinkedList<GainCostEquipment> gaincostList = new LinkedList<GainCostEquipment>();
		// Use while loop with varible numcount for user control amount items to enter
		double numcount = 0;
		while (numcount != -1) {
			String name;
			double gain;
			double cost;
			int count = 0;
			// input causes error because it wants the scanner closed after done but while
			// requires it open
			Scanner input = new Scanner(System.in);
			// Menu
			System.out.print("\n---------------------------------------------------"
					+ "\nEnter Number of Gain/Cost Equiptment to add to list"
					+ "\nor 0 to display list"
					+ "\nor -1 to display and quit "
					+ "\n---------------------------------------------------\n"
					+ "\nEnter number: ");
			// input number items to enter
			numcount = Double.parseDouble(input.nextLine());
			// while(count< 3){ could be used also but numcount allows more user control
			while (count < numcount) {
				// input equipment and gain and cost count displays number equipment entering
				System.out.print("Enter #" + (count + 1) + ". Equipment Name: ");
				name = input.nextLine();
				System.out.print("Enter Equipment Gain: ");
				gain = Double.parseDouble(input.nextLine());
				System.out.print("Enter Equipment Cost: ");
				cost = Double.parseDouble(input.nextLine());
				// Enters data into linked list gaincostequipment varible gce of class
				// GainCostEquipment
				GainCostEquipment gce = new GainCostEquipment(name, gain, cost);
				// calculates ROI using method or function calculateROI from class
				// GainCostEquipment
				gce.calculateROI();
				// Adds items to list
				gaincostList.add(gce);
				// adds each cycle until while less than numcount number then exits loop
				count++;
			}
			// calls collections to sort linked list items from best to worst
			Collections.sort(gaincostList);
			// Iterates linked list and prints sorted items with calculated ROI
			System.out.println("\n Best to Worst ROI Sorted Equipment List is : ");
			for (int i = 0; i < gaincostList.size(); i++) {
				System.out.println(gaincostList.get(i));
			}
		}

	}
}
