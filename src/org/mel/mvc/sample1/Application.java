package org.mel.mvc.sample1;

public class Application {
	public static void main(String[] args) {
		CalculatorView view = new CalculatorView();
		CalculatorModel model = new CalculatorModel();
		new CalculatorController(view, model);
		view.setVisible(true);
	}
}
