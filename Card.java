package HW5_bingo;

import java.util.Random;

public class Card {
	private int blocks[][] = new int[3][5];
	Random random = new Random();

	public Card() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 5; j++)
				blocks[i][j] = random.nextInt(90) + 1;
	}

	public Card(int[][] numbers) {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 5; j++)
				blocks[i][j] = numbers[i][j];
	}

	public int getNumber(int row, int column) {
		return blocks[row][column];
	}

	public boolean isMarked(int row, int column) {// is a block marked or not?
		if (getNumber(row, column) == 0)
			return true;
		else
			return false;
	}

	public void markNumber(int number) {// mark a number of blocks
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 5; j++)
				if (getNumber(i, j) == number)
					blocks[i][j] = 0;
	}
}
