import java.util.ArrayList;
import java.util.Random;


public class Set {
	private ArrayList<String> algNames;
	private ArrayList<String> algMoves;
	
	public Set() {
		
		algNames = new ArrayList<String>();
		algMoves = new ArrayList<String>();
		
		// initialize names of all the algorithms
		algNames.add("A (a)");
		algNames.add("A (b)");
		algNames.add("U (b)");
		algNames.add("U (a)");
		algNames.add("H");
		algNames.add("T");
		algNames.add("J (b)");
		algNames.add("Y");
		algNames.add("R (b)");
		algNames.add("R (a)");
		algNames.add("V");
		algNames.add("F");
		algNames.add("G (d)");
		algNames.add("G (b)");
		algNames.add("G (c)");
		algNames.add("G (a)");
		algNames.add("Z");
		algNames.add("J (a)");
		algNames.add("E");
		algNames.add("N (b)");
		algNames.add("N (a)");
		
		// ~~NEED TO ADD OLLS~~
	}
	
	public String pickRandom() {
		
		// random number generator
		Random rand = new Random();
		
		return algNames.get(rand.nextInt(algNames.size()));
	}
}
