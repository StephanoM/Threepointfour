import java.util.Scanner;
import javax.swing.JOptionPane;

public class Threepointfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numPeople, numPlayers;
		
		String input = JOptionPane.showInputDialog("Enter number of People");
		numPeople = Double.parseDouble(input);
		
		String input2 = JOptionPane.showInputDialog("Enter number of Players");
		numPlayers = Double.parseDouble(input2);
		
		
		if (numPeople >10){
			double groupSize = numPeople/2;
			System.out.println("The group size is: "+groupSize);
		}
			else if ((numPeople > 3) && (numPeople <10)) {
			
				double groupSize = numPlayers/11;
				System.out.println("The group size is: "+groupSize);
			}
			else {
				System.err.println("The number of people has to be at least 3");
		}
		
		
			
		if ((numPlayers >11) &&(numPlayers <55)) {

			
				double teamSize = (numPeople/3);
				System.out.println("The team size is: "+teamSize);
			}
		else {
			double teamSize = 1;
			System.out.println("The team size is: "+teamSize);
			
		}
		
	}

}
