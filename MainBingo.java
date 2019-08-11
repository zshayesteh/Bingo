package HW5_bingo;

import java.util.Random;
import java.util.Scanner;

public class MainBingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Hi,welcome to Bingo game :) \nenter the number of players: ");
		int numberOfPlayers = input.nextInt();
		Player[] players = new Player[numberOfPlayers];
		System.out.println("enter the number of cards for each player: ");
		int numberOfCards = input.nextInt();
		Card[] cards = new Card[numberOfCards];

		for (int i = 0; i < numberOfPlayers; i++) {
			for (int j = 0; j < numberOfCards; j++)
				cards[j] = new Card();
			players[i] = new Player(("player" + i), cards);
		}

		Random random = new Random();
		Bingo bingo = new Bingo(players);
		String winners = bingo.play(random.nextInt(90) + 1);
		while (winners.equals("")) {
			winners = bingo.play(random.nextInt(90) + 1);
			if (!winners.equals(""))
				System.out.println(winners);
		}
		input.close();
	}

}
