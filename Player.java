package HW5_bingo;

public class Player {

	private String name;
	private Card[] cards;

	public Player(String name, Card[] cards) {
		this.name = name;
		this.cards = new Card[cards.length];// vaghty cards ro mostaghim dar
											// cards rikhtam eshkal dasht
											// barname ama injoori dorost shod
		for (int i = 0; i < cards.length; i++)
			this.cards[i] = cards[i];
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public Card[] getCards() {
		return cards;
	}

	public boolean isWinner() {// is a player winner or not?
		Card[] c = getCards();
		int counter = 0;
		for (int i = 0; i < cards.length; i++)
			for (int j = 0; j < 3; j++)
				for (int k = 0; k < 5; k++) {
					if ((c[i].isMarked(j, k)) == true) {
						counter++;
						if (counter == 5)
							return true;
					} else {
						break;
					}
				}
		return false;
	}

	public void markNumber(int number) {// mark a number for player as checked
		int block;
		for (int i = 0; i < cards.length; i++)
			for (int row = 0; row < 3; row++)
				for (int column = 0; column < 5; column++) {
					block = cards[i].getNumber(row, column);
					if (block == number)
						cards[i].markNumber(number);
				}

	}

}
