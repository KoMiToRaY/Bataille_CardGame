import java.util.ArrayList;

public class Player {
	private String name;
	private int points;
	private ArrayList<Card> stack = new ArrayList<Card>();
	
	public Player(String _name){
		this.name = _name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getPoints(){
		return this.points;
	}
	
	public void setPoints(int points){
		this.points += points;
	}
	
	public ArrayList<Card> getStack(){
		return stack;
	}
	
	public void takeCard(Card card){
		stack.add(card);
	}
}
