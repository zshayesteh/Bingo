package HW5_bingo;

public class Bingo {
	private int numberOfPlayers;
	private Player[] player = new Player[numberOfPlayers];

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public Player[] getPlayer() {
		return player;
	}

	public void setPlayer(Player[] p) {
		this.player = p;
	}

	public Bingo(Player[] players) { // set players array
		setPlayer(players);
		setNumberOfPlayers(players.length);
	}

	public String play(int number) { //main function of the game
		String winners = "";
		for (int i = 0; i < numberOfPlayers; i++) {
			player[i].markNumber(number);
			if (player[i].isWinner())
				winners = winners + " " + player[i].getName();
		}
		return winners;
	}

}
