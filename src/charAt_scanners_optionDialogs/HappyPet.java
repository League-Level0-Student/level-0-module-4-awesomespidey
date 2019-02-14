package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
  String kindofpet = JOptionPane.showInputDialog("What kind of pet do you want??");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, feed, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.0
			int task = JOptionPane.showOptionDialog(null, " What do you want to do with your pet??", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "cuddle it", "feed it", "give it water","take it for a walk","groom it","clean up it's poop","play with it","sleep with it" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			System.out.println(task);
			if (task==7) {
				sleep();
			}
			else if(task==6) {
				play();
			}
			else if(task==5) {
				clean();
			}
			else if(task==4) {
				groom();
			}
			else if(task==3) {
				walk();
			}
			else if(task==2) {
				play();
			}
			else(task==1) {
				play();
			}
			
			
			
			
			
			
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

public static void feedIt() {
	JOptionPane.showMessageDialog(null,"Now they will not be starving;]");
	happinessLevel+=20;
}
public static void cuddle() {
	JOptionPane.showMessageDialog(null,"Hummm nice and warm:)");
	happinessLevel+=11;
}
public static void water() {
	JOptionPane.showMessageDialog(null,"No more thirst");
	happinessLevel+=10;
}
public static void walk() {
	JOptionPane.showMessageDialog(null,"Good life. Good heath.");
	happinessLevel+=13;
}
public static void groom() {
	JOptionPane.showMessageDialog(null,"Nice and clean");
	happinessLevel+=9;
}
public static void clean() {
	JOptionPane.showMessageDialog(null,"A least that is out of the way.");
	happinessLevel+=0;
}
public static void play() {
	JOptionPane.showMessageDialog(null," Having fun;)");
	happinessLevel+=20;
}
public static void sleep() {
	JOptionPane.showMessageDialog(null,"Good night");
	happinessLevel+=20;
}

}