
public class Card {
	private int number;
	private String color;
	
	public static String colors[] = {"Carreau", "Pique", "Coeur", "Tréfle"};
	public static int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

	
	public Card(int _number, String _color){
		this.number = _number;
		this.color = _color;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public int isBetterThan(Card card){
		if(this.number == card.getNumber())
			return 2;
		return (this.number > card.getNumber() ? 1 : 0);
	}
	
	public String toString(){
		return this.number+" de "+this.color;
	}
	
}