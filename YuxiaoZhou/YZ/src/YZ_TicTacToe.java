import java.util.Scanner;
import javax.swing.JOptionPane;

public class YZ_TicTacToe {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = "  ", b = "  ", c = "  ", d = "  ", e = "  ", f = "  ", g = "  ", h = "  ", i = "  ";
		int playerMove1;
		int computerMove1;
		int computerMove2;
		int playerMove2;
		int computerMove3;
		int playerMove3;
		int computerMove4;
		int playerMove4;
		int computerMove5;
		String board;
		board = a + "|" + b + "|" + c + "\n";
		board = board + "----------\n";
		board = board + d + "|" + e + "|" + f + "\n";
		board = board + "----------\n";
		board = board + g + "|" + h + "|" + i + "\n";
		JOptionPane.showMessageDialog(null, board);
		computerMove1 = 1 + (int) (Math.random() * 9);
		System.out.printf("computermove1 at position %d\n", computerMove1);
		if (computerMove1 == 1) {
			a = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove1 == 2) {
			b = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove1 == 3) {
			c = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove1 == 4) {
			d = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove1 == 5) {
			e = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove1 == 6) {
			f = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove1 == 7) {
			g = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove1 == 8) {
			h = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove1 == 9) {
			i = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		}

		playerMove1 = Integer
				.parseInt(JOptionPane
						.showInputDialog("Player'X',please enter your move, pick a number form 1 to 9"));
		while (playerMove1 == computerMove1) {
			JOptionPane.showMessageDialog(null, "Wrong move");
			playerMove1 = Integer
					.parseInt(JOptionPane
							.showInputDialog("Player'X',please enter your move, pick a number form 1 to 9"));
		}
		if ((playerMove1 == 1)) {
			a = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove1 == 2) {
			b = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove1 == 3) {
			c = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove1 == 4) {
			d = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove1 == 5) {
			e = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove1 == 6) {
			f = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove1 == 7) {
			g = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove1 == 8) {
			h = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove1 == 9) {
			i = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		}

		computerMove2 = 1 + (int) (Math.random() * 9);

		while ((computerMove2 == computerMove1)
				|| (computerMove2 == playerMove1)) {
			computerMove2 = 1 + (int) (Math.random() * 9);
		}
		System.out.printf("computermove2 at position %d\n", computerMove2);
		if (computerMove2 == 1) {
			a = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove2 == 2) {
			b = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove2 == 3) {
			c = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove2 == 4) {
			d = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove2 == 5) {
			e = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove2 == 6) {
			f = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove2 == 7) {
			g = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove2 == 8) {
			h = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove2 == 9) {
			i = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		}
		playerMove2 = Integer
				.parseInt(JOptionPane
						.showInputDialog("Player'X',please enter your move, pick a number form 1 to 9"));
		while ((playerMove2 == playerMove1) || (playerMove2 == computerMove1)
				|| (playerMove2 == computerMove2)) {
			JOptionPane.showMessageDialog(null, "Wrong move");
			playerMove2 = Integer
					.parseInt(JOptionPane
							.showInputDialog("Player'X',please enter your move, pick a number form 1 to 9"));
		}
		if ((playerMove2 == 1)) {
			a = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove2 == 2) {
			b = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove2 == 3) {
			c = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove2 == 4) {
			d = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove2 == 5) {
			e = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove2 == 6) {
			f = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove2 == 7) {
			g = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove2 == 8) {
			h = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (playerMove2 == 9) {
			i = "X";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		}
		computerMove3 = 1 + (int) (Math.random() * 9);
		while ((computerMove3 == computerMove2)
				|| (computerMove3 == computerMove1)
				|| (computerMove3 == playerMove1)
				|| (computerMove3 == playerMove2)) {
			computerMove3 = 1 + (int) (Math.random() * 9);
		}
		System.out.printf("computermove3 at position %d\n", computerMove3);
		if (computerMove3 == 1) {
			a = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove3 == 2) {
			b = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove3 == 3) {
			c = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove3 == 4) {
			d = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove3 == 5) {
			e = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove3 == 6) {
			f = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove3 == 7) {
			g = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove3 == 8) {
			h = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		} else if (computerMove3 == 9) {
			i = "O";
			board = a + "|" + b + "|" + c + "\n";
			board = board + "----------\n";
			board = board + d + "|" + e + "|" + f + "\n";
			board = board + "----------\n";
			board = board + g + "|" + h + "|" + i + "\n";
			JOptionPane.showMessageDialog(null, board);
		}
		if (((a == "O") && (b == "O") && (c == "O"))
				|| ((d == "O") && (e == "O") && (f == "O"))
				|| ((g == "O") && (h == "O") && (i == "O"))
				|| ((a == "O") && (d == "O") && (g == "O"))
				|| ((b == "O") && (e == "O") && (h == "O"))
				|| ((c == "O") && (f == "O") && (i == "O"))
				|| ((a == "O") && (e == "O") && (i == "O"))
				|| ((c == "O") && (e == "O") && (g == "O"))) {
			JOptionPane.showMessageDialog(null,
					"You lost!!Computer win. End game");
		} else {
			playerMove3 = Integer
					.parseInt(JOptionPane
							.showInputDialog("Player'X',please enter your move, pick a number form 1 to 9"));
			while ((playerMove3 == playerMove1) || (playerMove3 == playerMove2)
					|| (playerMove3 == computerMove3)
					|| (playerMove3 == computerMove2)
					|| (playerMove3 == computerMove1)) {
				JOptionPane.showMessageDialog(null, "Wrong move");
				playerMove3 = Integer
						.parseInt(JOptionPane
								.showInputDialog("Player'X',please enter your move, pick a number form 1 to 9"));
			}
			if ((playerMove3 == 1)) {
				a = "X";
				board = a + "|" + b + "|" + c + "\n";
				board = board + "----------\n";
				board = board + d + "|" + e + "|" + f + "\n";
				board = board + "----------\n";
				board = board + g + "|" + h + "|" + i + "\n";
				JOptionPane.showMessageDialog(null, board);
			} else if (playerMove3 == 2) {
				b = "X";
				board = a + "|" + b + "|" + c + "\n";
				board = board + "----------\n";
				board = board + d + "|" + e + "|" + f + "\n";
				board = board + "----------\n";
				board = board + g + "|" + h + "|" + i + "\n";
				JOptionPane.showMessageDialog(null, board);
			} else if (playerMove3 == 3) {
				c = "X";
				board = a + "|" + b + "|" + c + "\n";
				board = board + "----------\n";
				board = board + d + "|" + e + "|" + f + "\n";
				board = board + "----------\n";
				board = board + g + "|" + h + "|" + i + "\n";
				JOptionPane.showMessageDialog(null, board);
			} else if (playerMove3 == 4) {
				d = "X";
				board = a + "|" + b + "|" + c + "\n";
				board = board + "----------\n";
				board = board + d + "|" + e + "|" + f + "\n";
				board = board + "----------\n";
				board = board + g + "|" + h + "|" + i + "\n";
				JOptionPane.showMessageDialog(null, board);
			} else if (playerMove3 == 5) {
				e = "X";
				board = a + "|" + b + "|" + c + "\n";
				board = board + "----------\n";
				board = board + d + "|" + e + "|" + f + "\n";
				board = board + "----------\n";
				board = board + g + "|" + h + "|" + i + "\n";
				JOptionPane.showMessageDialog(null, board);
			} else if (playerMove3 == 6) {
				f = "X";
				board = a + "|" + b + "|" + c + "\n";
				board = board + "----------\n";
				board = board + d + "|" + e + "|" + f + "\n";
				board = board + "----------\n";
				board = board + g + "|" + h + "|" + i + "\n";
				JOptionPane.showMessageDialog(null, board);
			} else if (playerMove3 == 7) {
				g = "X";
				board = a + "|" + b + "|" + c + "\n";
				board = board + "----------\n";
				board = board + d + "|" + e + "|" + f + "\n";
				board = board + "----------\n";
				board = board + g + "|" + h + "|" + i + "\n";
				JOptionPane.showMessageDialog(null, board);
			} else if (playerMove3 == 8) {
				h = "X";
				board = a + "|" + b + "|" + c + "\n";
				board = board + "----------\n";
				board = board + d + "|" + e + "|" + f + "\n";
				board = board + "----------\n";
				board = board + g + "|" + h + "|" + i + "\n";
				JOptionPane.showMessageDialog(null, board);
			} else if (playerMove3 == 9) {
				i = "X";
				board = a + "|" + b + "|" + c + "\n";
				board = board + "----------\n";
				board = board + d + "|" + e + "|" + f + "\n";
				board = board + "----------\n";
				board = board + g + "|" + h + "|" + i + "\n";
				JOptionPane.showMessageDialog(null, board);
			}
			if (((a == "X") && (b == "X") && (c == "X"))
					|| ((d == "X") && (e == "X") && (f == "X"))
					|| ((g == "X") && (h == "X") && (i == "X"))
					|| ((a == "X") && (d == "X") && (g == "X"))
					|| ((b == "X") && (e == "X") && (h == "X"))
					|| ((c == "X") && (f == "X") && (i == "X"))
					|| ((a == "X") && (e == "X") && (i == "X"))
					|| ((c == "X") && (e == "X") && (g == "X"))) {
				JOptionPane.showMessageDialog(null, "You WIN! End game");
			} else {
				computerMove4 = 1 + (int) (Math.random() * 9);
				while ((computerMove4 == computerMove3)
						|| (computerMove4 == computerMove2)
						|| (computerMove4 == computerMove1)
						|| (computerMove4 == playerMove1)
						|| (computerMove4 == playerMove2)
						|| (computerMove4 == playerMove3)) {
					computerMove4 = 1 + (int) (Math.random() * 9);
				}
				System.out
						.printf("computermove4 at position %d", computerMove4);
				if (computerMove4 == 1) {
					a = "O";
					board = a + "|" + b + "|" + c + "\n";
					board = board + "----------\n";
					board = board + d + "|" + e + "|" + f + "\n";
					board = board + "----------\n";
					board = board + g + "|" + h + "|" + i + "\n";
					JOptionPane.showMessageDialog(null, board);
				} else if (computerMove4 == 2) {
					b = "O";
					board = a + "|" + b + "|" + c + "\n";
					board = board + "----------\n";
					board = board + d + "|" + e + "|" + f + "\n";
					board = board + "----------\n";
					board = board + g + "|" + h + "|" + i + "\n";
					JOptionPane.showMessageDialog(null, board);
				} else if (computerMove4 == 3) {
					c = "O";
					board = a + "|" + b + "|" + c + "\n";
					board = board + "----------\n";
					board = board + d + "|" + e + "|" + f + "\n";
					board = board + "----------\n";
					board = board + g + "|" + h + "|" + i + "\n";
					JOptionPane.showMessageDialog(null, board);
				} else if (computerMove4 == 4) {
					d = "O";
					board = a + "|" + b + "|" + c + "\n";
					board = board + "----------\n";
					board = board + d + "|" + e + "|" + f + "\n";
					board = board + "----------\n";
					board = board + g + "|" + h + "|" + i + "\n";
					JOptionPane.showMessageDialog(null, board);
				} else if (computerMove4 == 5) {
					e = "O";
					board = a + "|" + b + "|" + c + "\n";
					board = board + "----------\n";
					board = board + d + "|" + e + "|" + f + "\n";
					board = board + "----------\n";
					board = board + g + "|" + h + "|" + i + "\n";
					JOptionPane.showMessageDialog(null, board);
				} else if (computerMove4 == 6) {
					f = "O";
					board = a + "|" + b + "|" + c + "\n";
					board = board + "----------\n";
					board = board + d + "|" + e + "|" + f + "\n";
					board = board + "----------\n";
					board = board + g + "|" + h + "|" + i + "\n";
					JOptionPane.showMessageDialog(null, board);
				} else if (computerMove4 == 7) {
					g = "O";
					board = a + "|" + b + "|" + c + "\n";
					board = board + "----------\n";
					board = board + d + "|" + e + "|" + f + "\n";
					board = board + "----------\n";
					board = board + g + "|" + h + "|" + i + "\n";
					JOptionPane.showMessageDialog(null, board);
				} else if (computerMove4 == 8) {
					h = "O";
					board = a + "|" + b + "|" + c + "\n";
					board = board + "----------\n";
					board = board + d + "|" + e + "|" + f + "\n";
					board = board + "----------\n";
					board = board + g + "|" + h + "|" + i + "\n";
					JOptionPane.showMessageDialog(null, board);
				} else if (computerMove4 == 9) {
					i = "O";
					board = a + "|" + b + "|" + c + "\n";
					board = board + "----------\n";
					board = board + d + "|" + e + "|" + f + "\n";
					board = board + "----------\n";
					board = board + g + "|" + h + "|" + i + "\n";
					JOptionPane.showMessageDialog(null, board);
				}
				if (((a == "O") && (b == "O") && (c == "O"))
						|| ((d == "O") && (e == "O") && (f == "O"))
						|| ((g == "O") && (h == "O") && (i == "O"))
						|| ((a == "O") && (d == "O") && (g == "O"))
						|| ((b == "O") && (e == "O") && (h == "O"))
						|| ((c == "O") && (f == "O") && (i == "O"))
						|| ((a == "O") && (e == "O") && (i == "O"))
						|| ((c == "O") && (e == "O") && (g == "O"))) {
					JOptionPane.showMessageDialog(null,
							"You lost!!Computer win. End game");
				} else {
					playerMove4 = Integer
							.parseInt(JOptionPane
									.showInputDialog("Player'X',please enter your move, pick a number form 1 to 9"));
					while ((playerMove4 == playerMove1)
							|| (playerMove4 == playerMove2)
							|| (playerMove4 == playerMove3)
							|| (playerMove4 == computerMove4)
							|| (playerMove4 == computerMove3)
							|| (playerMove4 == computerMove2)
							|| (playerMove4 == computerMove1)) {
						JOptionPane.showMessageDialog(null, "Wrong move");
						playerMove4 = Integer
								.parseInt(JOptionPane
										.showInputDialog("Player'X',please enter your move, pick a number form 1 to 9"));
					}
					if ((playerMove4 == 1)) {
						a = "X";
						board = a + "|" + b + "|" + c + "\n";
						board = board + "----------\n";
						board = board + d + "|" + e + "|" + f + "\n";
						board = board + "----------\n";
						board = board + g + "|" + h + "|" + i + "\n";
						JOptionPane.showMessageDialog(null, board);
					} else if (playerMove4 == 2) {
						b = "X";
						board = a + "|" + b + "|" + c + "\n";
						board = board + "----------\n";
						board = board + d + "|" + e + "|" + f + "\n";
						board = board + "----------\n";
						board = board + g + "|" + h + "|" + i + "\n";
						JOptionPane.showMessageDialog(null, board);
					} else if (playerMove4 == 3) {
						c = "X";
						board = a + "|" + b + "|" + c + "\n";
						board = board + "----------\n";
						board = board + d + "|" + e + "|" + f + "\n";
						board = board + "----------\n";
						board = board + g + "|" + h + "|" + i + "\n";
						JOptionPane.showMessageDialog(null, board);
					} else if (playerMove4 == 4) {
						d = "X";
						board = a + "|" + b + "|" + c + "\n";
						board = board + "----------\n";
						board = board + d + "|" + e + "|" + f + "\n";
						board = board + "----------\n";
						board = board + g + "|" + h + "|" + i + "\n";
						JOptionPane.showMessageDialog(null, board);
					} else if (playerMove4 == 5) {
						e = "X";
						board = a + "|" + b + "|" + c + "\n";
						board = board + "----------\n";
						board = board + d + "|" + e + "|" + f + "\n";
						board = board + "----------\n";
						board = board + g + "|" + h + "|" + i + "\n";
						JOptionPane.showMessageDialog(null, board);
					} else if (playerMove4 == 6) {
						f = "X";
						board = a + "|" + b + "|" + c + "\n";
						board = board + "----------\n";
						board = board + d + "|" + e + "|" + f + "\n";
						board = board + "----------\n";
						board = board + g + "|" + h + "|" + i + "\n";
						JOptionPane.showMessageDialog(null, board);
					} else if (playerMove4 == 7) {
						g = "X";
						board = a + "|" + b + "|" + c + "\n";
						board = board + "----------\n";
						board = board + d + "|" + e + "|" + f + "\n";
						board = board + "----------\n";
						board = board + g + "|" + h + "|" + i + "\n";
						JOptionPane.showMessageDialog(null, board);
					} else if (playerMove4 == 8) {
						h = "X";
						board = a + "|" + b + "|" + c + "\n";
						board = board + "----------\n";
						board = board + d + "|" + e + "|" + f + "\n";
						board = board + "----------\n";
						board = board + g + "|" + h + "|" + i + "\n";
						JOptionPane.showMessageDialog(null, board);
					} else if (playerMove4 == 9) {
						i = "X";
						board = a + "|" + b + "|" + c + "\n";
						board = board + "----------\n";
						board = board + d + "|" + e + "|" + f + "\n";
						board = board + "----------\n";
						board = board + g + "|" + h + "|" + i + "\n";
						JOptionPane.showMessageDialog(null, board);
					}
					if (((a == "X") && (b == "X") && (c == "X"))
							|| ((d == "X") && (e == "X") && (f == "X"))
							|| ((g == "X") && (h == "X") && (i == "X"))
							|| ((a == "X") && (d == "X") && (g == "X"))
							|| ((b == "X") && (e == "X") && (h == "X"))
							|| ((c == "X") && (f == "X") && (i == "X"))
							|| ((a == "X") && (e == "X") && (i == "X"))
							|| ((c == "X") && (e == "X") && (g == "X"))) {
						JOptionPane
								.showMessageDialog(null, "You WIN! End game");
					} else {
						computerMove5 = 1 + (int) (Math.random() * 9);
						while ((computerMove5 == computerMove4)
								|| (computerMove5 == computerMove3)
								|| (computerMove5 == computerMove2)
								|| (computerMove5 == computerMove1)
								|| (computerMove5 == playerMove1)
								|| (computerMove5 == playerMove2)
								|| (computerMove5 == playerMove3)
								|| (computerMove5 == playerMove4)) {
							computerMove5 = 1 + (int) (Math.random() * 9);
						}
						System.out.printf("computermove5 at position %d\n",
								computerMove5);
						if (computerMove5 == 1) {
							a = "O";
							board = a + "|" + b + "|" + c + "\n";
							board = board + "----------\n";
							board = board + d + "|" + e + "|" + f + "\n";
							board = board + "----------\n";
							board = board + g + "|" + h + "|" + i + "\n";
							JOptionPane.showMessageDialog(null, board);
						} else if (computerMove5 == 2) {
							b = "O";
							board = a + "|" + b + "|" + c + "\n";
							board = board + "----------\n";
							board = board + d + "|" + e + "|" + f + "\n";
							board = board + "----------\n";
							board = board + g + "|" + h + "|" + i + "\n";
							JOptionPane.showMessageDialog(null, board);
						} else if (computerMove5 == 3) {
							c = "O";
							board = a + "|" + b + "|" + c + "\n";
							board = board + "----------\n";
							board = board + d + "|" + e + "|" + f + "\n";
							board = board + "----------\n";
							board = board + g + "|" + h + "|" + i + "\n";
							JOptionPane.showMessageDialog(null, board);
						} else if (computerMove5 == 4) {
							d = "O";
							board = a + "|" + b + "|" + c + "\n";
							board = board + "----------\n";
							board = board + d + "|" + e + "|" + f + "\n";
							board = board + "----------\n";
							board = board + g + "|" + h + "|" + i + "\n";
							JOptionPane.showMessageDialog(null, board);
						} else if (computerMove5 == 5) {
							e = "O";
							board = a + "|" + b + "|" + c + "\n";
							board = board + "----------\n";
							board = board + d + "|" + e + "|" + f + "\n";
							board = board + "----------\n";
							board = board + g + "|" + h + "|" + i + "\n";
							JOptionPane.showMessageDialog(null, board);
						} else if (computerMove5 == 6) {
							f = "O";
							board = a + "|" + b + "|" + c + "\n";
							board = board + "----------\n";
							board = board + d + "|" + e + "|" + f + "\n";
							board = board + "----------\n";
							board = board + g + "|" + h + "|" + i + "\n";
							JOptionPane.showMessageDialog(null, board);
						} else if (computerMove5 == 7) {
							g = "O";
							board = a + "|" + b + "|" + c + "\n";
							board = board + "----------\n";
							board = board + d + "|" + e + "|" + f + "\n";
							board = board + "----------\n";
							board = board + g + "|" + h + "|" + i + "\n";
							JOptionPane.showMessageDialog(null, board);
						} else if (computerMove5 == 8) {
							h = "O";
							board = a + "|" + b + "|" + c + "\n";
							board = board + "----------\n";
							board = board + d + "|" + e + "|" + f + "\n";
							board = board + "----------\n";
							board = board + g + "|" + h + "|" + i + "\n";
							JOptionPane.showMessageDialog(null, board);
						} else if (computerMove5 == 9) {
							i = "O";
							board = a + "|" + b + "|" + c + "\n";
							board = board + "----------\n";
							board = board + d + "|" + e + "|" + f + "\n";
							board = board + "----------\n";
							board = board + g + "|" + h + "|" + i + "\n";
							JOptionPane.showMessageDialog(null, board);
						}
						if (((a == "O") && (b == "O") && (c == "O"))
								|| ((d == "O") && (e == "O") && (f == "O"))
								|| ((g == "O") && (h == "O") && (i == "O"))
								|| ((a == "O") && (d == "O") && (g == "O"))
								|| ((b == "O") && (e == "O") && (h == "O"))
								|| ((c == "O") && (f == "O") && (i == "O"))
								|| ((a == "O") && (e == "O") && (i == "O"))
								|| ((c == "O") && (e == "O") && (g == "O"))) {
							JOptionPane.showMessageDialog(null,
									"You lost!!Computer win. End game");
						} else {
							JOptionPane.showMessageDialog(null, "GAME TIE!!");
						}
					}
				}
			}
		}
	}
}
