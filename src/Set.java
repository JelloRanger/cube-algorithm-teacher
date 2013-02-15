import java.util.ArrayList;
import java.util.Random;


public class Set {
	protected ArrayList<String> algNames;
	protected ArrayList<String> algMoves;
	
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
		
		algMoves.add("x [(R' U R') D2] [(R U' R') D2] R2");
		algMoves.add("x' [(R U' R) D2] [(R' U R) D2] R2");
		algMoves.add("[R U'] [R U] [R U] [R U'] R' U' R2");
		algMoves.add("R2 U [R U R' U'] (R' U') (R' U R')");
		algMoves.add("M2 U M2 U2 M2 U M2");
		algMoves.add("[R U R' U'] [R' F] [R2 U' R'] U' [R U R' F']");
		algMoves.add("[R U R' F'] {[R U R' U'] [R' F] [R2 U' R'] U'}");
		algMoves.add("F R U' R' U' [R U R' F'] {[R U R' U'] [R' F R F']}");
		algMoves.add("[R' U2 R U2] [R' F] [R U R' U'] [R' F'] R2 U'");
		algMoves.add("[L U2' L' U2'] [L F'] [L' U' L U] [L F] L2' U");
		algMoves.add("[R' U R' d'] [R' F'] [R2 U' R' U] [R' F R F]");
		algMoves.add("[R' U2 R' d'] [R' F'] [R2 U' R' U] [R' F R U' F]");
		algMoves.add("[R U R'] y' R2 u' R U' R' U R' u R2");
		algMoves.add("[R' U' R] y R2 u R' U R U' R u' R2");
		algMoves.add("R2 u' R U' R U R' u R2 [y R U' R']");
		algMoves.add("R2 u R' U R' U' R u' R2 [y' R' U R]");
		algMoves.add("M2 U M2 U M' U2 M2 U2 M' U2");
		algMoves.add("[R' U L'] [U2 R U' R' U2] [R L U']");
		algMoves.add("x' (R U' R') D (R U R') D' (R U R') D (R U' R') D'");
		algMoves.add("{(R' U L') U2 (R U' L)} {(R' U L') U2 (R U' L)} U'");
		algMoves.add("{(L U' R) U2 (L' U R')} {(L U' R) U2 (L' U R')} U");
		
		
		// ~~NEED TO ADD OLLS~~
	}
	
	protected String pickRandom() {
		
		// random number generator
		Random rand = new Random();
		
		return algNames.get(rand.nextInt(algNames.size()));
	}
	
	// get moves for an algorithm given its name
	protected String getAlgorithm(String n) {
		return algMoves.get(algNames.indexOf(n));
	}
}
