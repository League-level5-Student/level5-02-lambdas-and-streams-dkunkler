package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		addNumbers.addActionListener(
		
		(ActionEvent e)->{
			String n1 = JOptionPane.showInputDialog("enter your first number");
			String n2 = JOptionPane.showInputDialog("Enter your second numner");
			int sum = Integer.parseInt(n1) + Integer.parseInt(n2);
			JOptionPane.showMessageDialog(null, "The sum of " + n1 + " and " + n2 + " is " + sum);
		
		}
		);
		
		
		randNumber.addActionListener(
				
				(ActionEvent e)->{
					String n1 = JOptionPane.showInputDialog("I will pick a number between 1 and what?");
					Random rand = new Random();
					int i = rand.nextInt(Integer.parseInt(n1));
					JOptionPane.showMessageDialog(null, "I pick " + i);
				
				}
				);
				
		tellAJoke.addActionListener(
				
				(ActionEvent e)->{
					JOptionPane.showMessageDialog(null, "There are only 10 types of people in this world. \nThose that know binary, and those that don't");
				
				}
				);
				
					
		
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
