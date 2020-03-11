package com.oop.lab6;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game extends JFrame implements ActionListener {
	JPanel topPanel;
	JPanel centerPanel;
	JPanel bottomPanel;
	JButton generate;
	JLabel label;
	JTextField guess;
	JButton check;
	
	private Random random;
	private int randomNumber;
	private int guessNumber;
	private int guesses;
	private boolean numberGenerated = false;
	
	public Game() {
		super("Guessing Game");
		setSize(300, 300);
		setLayout(new GridLayout(3, 1));
		topPanel = new JPanel();
		centerPanel = new JPanel();
		bottomPanel = new JPanel();
		generate = new JButton("Generate a random number");
		label = new JLabel("Make a guess:");
		guess = new JTextField("Enter your guess");
		check = new JButton("Check your guess");
		
		random = new Random();
		generate.addActionListener(this);
		check.addActionListener(this);
		
		topPanel.add(generate);
		centerPanel.add(label);
		centerPanel.add(guess);
		bottomPanel.add(check);
		
		add(topPanel);
		add(centerPanel);
		add(bottomPanel);
		
		setVisible(true);
	}
	
	private void checkNumber(int numberGuess) {
		if (numberGuess == randomNumber) {
			JOptionPane.showMessageDialog(this, "You guessed right. It took you " + guesses + " guesses.");
			numberGenerated = false;
		}
		else if (numberGuess < randomNumber) {
			JOptionPane.showMessageDialog(this, "Too low");
		}
		else if (numberGuess > randomNumber) {
			JOptionPane.showMessageDialog(this, "Too high");
		}
		
		guesses++;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == generate) {
			randomNumber = random.nextInt(100);
			guesses = 0;
			numberGenerated = true;
			JOptionPane.showMessageDialog(this, "Generated number between 0 and 100");
		}
		else if (e.getSource() == check) {	
			if (!numberGenerated) {
				JOptionPane.showMessageDialog(this, "You must generate a number first");
				return;
			}
			
			try {
				guessNumber = Integer.valueOf(guess.getText());
			}
			catch (Exception exception) {
				JOptionPane.showMessageDialog(this, "Not a number");
				return;
			}
			
			if ((guessNumber >= 0) && (guessNumber <= 100)) {
				checkNumber(guessNumber);
			} else {
				JOptionPane.showMessageDialog(this, "You must guess between 0 and 100");
			}
		}
	}
}
