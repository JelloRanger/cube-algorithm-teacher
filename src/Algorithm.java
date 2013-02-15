
public class Algorithm {
	
	// name and list of moves for algorithm
	private String name;
	private String moves;
	
	// default constructor
	public Algorithm() {
		name = "";
		moves = "";
	}
	
	// normal constructor
	public Algorithm(String n, String m) {
		name = n;
		moves = m;
	}
	
	// getters
	public String getName() {
		return name;
	}
	
	public String getMoves() {
		return moves;
	}
	
	// setters
	public void setName(String n) {
		name = n;
	}
	
	public void setMoves(String m) {
		moves = m;
	}
	
}
