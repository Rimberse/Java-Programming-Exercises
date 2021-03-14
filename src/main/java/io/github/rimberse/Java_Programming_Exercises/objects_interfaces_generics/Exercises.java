package io.github.rimberse.Java_Programming_Exercises.objects_interfaces_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;

public class Exercises {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
//		Exercise 5.1:
//		PairOfDice pair = new PairOfDice(5, 2);
//		Assertions.assertEquals(5, pair.getDie1());
//		pair.setDie1(1);
//		Assertions.assertEquals(1, pair.getDie1());
//		Assertions.assertEquals(2, pair.getDie2());
//		pair.checkDiceValues();
//		System.out.println(pair);
//		System.out.println("Dices have been rolled " + pair.countRollsToGet(2) + " times to get the total of 2");
		
		
//		Exercise 5.2:
//		StatCalc calc = new StatCalc();
//		System.out.println("Please enter the numbers you want or enter 0 to stop:");
//		while (scanner.hasNextDouble()) {
//			double number = scanner.nextDouble();
//			if (number == 0d)
//				break;
//			
//			calc.enter(number);
//		}
//		
//		System.out.println("Count: " + calc.getCount());
//		System.out.println("Sum: " + calc.getSum());
//		System.out.println("Mean: " + calc.getMean());
//		System.out.println("Standard Deviation: " + calc.getStandardDeviation());
//		System.out.println("Maximum: " + calc.getMax());
//		System.out.println("Minimum: " + calc.getMin());
		
		
//		Exercise 5.3:
//		List<Integer> totals = new ArrayList<>();
//		System.out.println("Please enter totals that you would like to roll in a rage between 2 and 12");
//		while (scanner.hasNextInt()) {
//			int number = scanner.nextInt();
//			if (number < 2 || number > 12)
//				break;
//			totals.add(number);
//		}
//		
//		System.out.println("Total On Dice     Average Number of Rolls     Standard Deviation     Maximum Number of Rolls\n"
//						 + "-------------     -----------------------     ------------------     -----------------------");
//		
//		for (int total : totals) {
//			PairOfDice dicePair = new PairOfDice();
//			StatCalc calc = new StatCalc();
//			int sum = 0;
//			
//			for (int i = 0; i < 10000; i++) {
//				dicePair.setRollCount(0);
//				
//				while (true) {
//					dicePair.roll();
//					if (dicePair.getDie1() + dicePair.getDie2() == total)
//						break;
//				}
//				
//				calc.enter(dicePair.getRollCount());
//				sum += dicePair.getRollCount();
//			}
//			
//			System.out.println("       " + total + "               " + (double) sum / 10000
//							 + "                " + calc.getStandardDeviation() + "               " + (int) calc.getMax());
//		}
		
		
//		Exercise 5.4:
//		while (true) {
//			BlackjackHand blackjack = new BlackjackHand();
//			Deck deck = new Deck();
//			deck.shuffle();
//			int randNumber = (int) (Math.random() * 5) + 2;
//			
//			for (int i = 0; i < randNumber; i++) {
//				blackjack.addCard(deck.dealCard());
//			}
//			
//			for (int i = 0; i < blackjack.getCardCount(); i++) {
//				Card card = blackjack.getCard(i);
//				System.out.println("Card " + (i + 1) + ": " + card);
//			}
//			
//			System.out.println("Blackjack value: " + blackjack.getBlackjackValue() + "\n");
//			
//			System.out.println("Do you want to continue? Enter no to stop");
//			String answer = scanner.nextLine();
//			if (answer.equalsIgnoreCase("no"))
//				break;
//		}
		
		
//		Exercise 5.5:
//		double money = 100d;
//		double bet;
//		
//		System.out.println("Type 'play' to begin");
//		
//		while (true) {
//			String input = scanner.nextLine();
//			
//			if (input.equalsIgnoreCase("play")) {
//				System.out.println("Place your bet: ");
//				bet = scanner.nextDouble();		// If we don't check for negative values,
//				scanner.nextLine();				// then the player will earn money when they lose
//				while (bet <= 0d) {
//					System.out.println("Please enter a positive value, don't try to fool the system:");
//					bet = scanner.nextDouble();
//					scanner.nextLine();
//				}
//				
//				boolean playerWon = playBlackjack();
//				
//				if (playerWon) {
//					money += bet;
//					System.out.println("You've won!");
//				} else {
//					System.out.println("Dealer wins!");
//					money -= bet;
//				}
//				
//			} else if (input.equalsIgnoreCase("quit"))
//				break;
//			else {
//				throw new IllegalArgumentException("Input wasn't recognized!");
//			}
//			
//			System.out.println("Your balance: " + money + "\n");
//			
//			if (money <= 0d) {
//				System.out.println("You've run out of money! Come back when you will have more.");
//				break;
//			}
//			
//			System.out.println("Type 'play' to play again or type 'quit' to stop!");
//		}
		
		
//		Exercise 5.6:
//		AdditionQuestion[] questions = new AdditionQuestion[10];
//		int[] answers = new int[10];
//		int index = 0;
//		int score = 0;
//		
//		for (int i = 0; i < questions.length; i++) {
//			questions[i] = new AdditionQuestion();
//		}
//		
//		for (AdditionQuestion question : questions) {
//			System.out.println(question.getQuestion());
//			answers[index] = scanner.nextInt();
//			index++;
//		}
//		
//		for (int i = 0; i < answers.length; i++) {
//			System.out.println("Question: " + questions[i].getQuestion());
//			System.out.println("Your answer: " + answers[i]);
//			System.out.println(answers[i] == questions[i].getCorrectAnswer() ? "Correct! You receive 10 pts" : "Incorrect! "
//				+ "Right answer: " + questions[i].getCorrectAnswer());
//			if (answers[i] == questions[i].getCorrectAnswer())
//				score += 10;
//		}
//		
//		System.out.println("Your score: " + score);
		
		
//		Exercise 5.7:
		IntQuestion[] questions = new IntQuestion[10];
		int[] answers = new int[10];
		int index = 0;
		int score = 0;
		
		for (int i = 0; i < questions.length / 2; i++) {
			questions[i] = new AdditionQuestion();
		}
		
		for (int i = questions.length / 2 + 1; i < questions.length - 1; i++) {
			questions[i] = new SubtractionQuestion();
		}
		
		questions[questions.length / 2] = new IntQuestion() {
			@Override
			public String getQuestion() {
				return "What is the answer to the ultimate question of life, the universe, and everything?";
			}
			
			@Override
			public int getCorrectAnswer() {
				return 42;
			}
		};
		
		questions[questions.length - 1] = new IntQuestion() {
			@Override
			public String getQuestion() {
				return "A year, when did the soviet union collapse?";
			}
			
			@Override
			public int getCorrectAnswer() {
				return 1991;
			}
		};
		
		for (IntQuestion question : questions) {
			System.out.println(question.getQuestion());
			answers[index] = scanner.nextInt();
			index++;
		}
		
		for (int i = 0; i < answers.length; i++) {
			System.out.println("Question: " + questions[i].getQuestion());
			System.out.println("Your answer: " + answers[i]);
			System.out.println(answers[i] == questions[i].getCorrectAnswer() ? "Correct! You receive 10 pts" : "Incorrect! "
				+ "Right answer: " + questions[i].getCorrectAnswer());
			if (answers[i] == questions[i].getCorrectAnswer())
				score += 10;
		}
		
		System.out.println("Your score: " + score);
	}
	
	
	/**
	 * Lets the user play a Blackjack game. Game rules are defined in the Exercise 5.5's description
	 * @return <strong>true</strong> - if player wins, else - <strong>false</strong>
	 * @throws IllegalArgumentException - if the input String wasn't recognized
	 */
	public static boolean playBlackjack() {
		Deck deck = new Deck();
		deck.shuffle();
		BlackjackHand blackjackHandDealer = new BlackjackHand();
		BlackjackHand blackjackHandPlayer = new BlackjackHand();
		
		blackjackHandPlayer.addCard(dealCardFaceUp(deck, true));
		blackjackHandPlayer.addCard(dealCardFaceUp(deck, true));
		blackjackHandDealer.addCard(dealCardFaceUp(deck, false));	// Player gets to see only one card from dealer's hand
		blackjackHandDealer.addCard(deck.dealCard());
		
		if (blackjackHandDealer.getBlackjackValue() == 21) { // dealer wins on a tie, hence why this if statement comes first
			System.out.println("\nDealer's hand blackjack value: " + blackjackHandDealer.getBlackjackValue());
			return false;
			
		} else if (blackjackHandPlayer.getBlackjackValue() == 21) {
			System.out.println("\nPlayer's hand blackjack value: " + blackjackHandPlayer.getBlackjackValue());
			return true;
		}
		
		System.out.println("\nPlease choose one option:"
				+ "\n'Hit' [add another card to your hand] or 'Stand' [stop taking cards]");
		
		while (scanner.hasNextLine()) {
			String decision = scanner.nextLine();
			
			if (decision.equalsIgnoreCase("Hit")) {
				blackjackHandPlayer.addCard(dealCardFaceUp(deck, true));
				
				if (blackjackHandPlayer.getBlackjackValue() > 21) {
					System.out.println("\nPlayer's hand blackjack value: " + blackjackHandPlayer.getBlackjackValue());
					return false;
				}
				
			} else if (decision.equalsIgnoreCase("Stand")) {
				int dealerHandBlackjackValue = blackjackHandDealer.getBlackjackValue();
				
				while (dealerHandBlackjackValue <= 16) {
					blackjackHandDealer.addCard(dealCardFaceUp(deck, false));
					dealerHandBlackjackValue = blackjackHandDealer.getBlackjackValue();
				}
				
				if (blackjackHandDealer.getBlackjackValue() > 21) {
					System.out.println("\nDealer's hand blackjack value: " + blackjackHandDealer.getBlackjackValue());
					return true;
					
				} else if (blackjackHandDealer.getBlackjackValue() >= blackjackHandPlayer.getBlackjackValue()) {
					System.out.println("\nDealer's hand blackjack value: " + blackjackHandDealer.getBlackjackValue());
					return false;
					
				} else
					break;
			} else {
				throw new IllegalArgumentException("Only two options are available");
			}
			
			System.out.println("\nPlease choose one option:"
					+ "\nHit [add another card to your hand] or Stand [stop taking cards]");
		}
		
		System.out.println("\nPlayer's hand blackjack value: " + blackjackHandPlayer.getBlackjackValue());
		return true;		// Player wins, dealer's hand total is lower
	}
	
	public static Card dealCardFaceUp(Deck deck, boolean player) {
		Card card = deck.dealCard();
		System.out.println("Dealt a card to " + (player ? "Player" : "Dealer") + ": " + card);
		return card;
	}
}