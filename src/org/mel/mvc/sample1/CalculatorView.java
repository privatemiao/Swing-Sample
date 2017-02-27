package org.mel.mvc.sample1;

import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextField firstNumber = new JTextField(10);
	private JTextField secondNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);

	public CalculatorView() throws HeadlessException {
		JPanel calcPanel = new JPanel();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);

		add(calcPanel);
		setLocationRelativeTo(null);
		setTitle("Sample swing mvc");
		pack();
	}

	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText());
	}

	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText());
	}

	public int getCalcSolution() {
		return Integer.parseInt(calcSolution.getText());
	}

	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}

	public void addCalculationListener(ActionListener listenerForCalcButton) {
		calculateButton.addActionListener(listenerForCalcButton);
	}

	public void displayErrorMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
}
