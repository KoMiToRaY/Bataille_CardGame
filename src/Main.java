import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		ArrayList<Card> deck = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name player 1 ?");
		String play1 = sc.nextLine();
		System.out.println("Name player 2 ?");
		String play2 = sc.nextLine();
		
		Player player1 = new Player(play1);
		Player player2 = new Player(play2);
		
		int counter = 0;
		for (int j = 0; j < Card.colors.length; j++){
			for (int k = 0; k < Card.numbers.length; k++){
				Card card = new Card(Card.numbers[k], Card.colors[j]);
				deck.add(card);
				counter++;
			}
		}
		
		Collections.shuffle(deck);
		
		for(int i = 0; i < deck.size(); i = i+2){
			player1.takeCard(deck.get(i));
			player2.takeCard(deck.get(i+1));
		}
		
		int win = 1;
		for (int i = player1.getStack().size(); i > 0; i--){
			if (player1.getStack().get(i-1).isBetterThan(player2.getStack().get(i-1)) == 1){
				player1.setPoints(win);
				win = 1;
			} else if (player1.getStack().get(i-1).isBetterThan(player2.getStack().get(i-1)) == 0){
				player2.setPoints(win);
				win = 1;
			} else {
				win = 2;
			}
		}
		
		if (player1.getPoints() > player2.getPoints()){
			System.out.println("The winner is "+player1.getName()+" with "+player1.getPoints()+" points");
		} else if (player2.getPoints() > player1.getPoints()){
			System.out.println("The winner is "+player2.getName()+" with "+player2.getPoints()+" points");
		} else {
			System.out.println("equality");
		}
	}
}
