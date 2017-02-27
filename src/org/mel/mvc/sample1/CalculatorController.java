package org.mel.mvc.sample1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	public CalculatorController(CalculatorView view, CalculatorModel model) {
		view.addCalculationListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					model.addTwoNumbers(view.getFirstNumber(), view.getSecondNumber());
					view.setCalcSolution(model.getCalculationValue());
				} catch (NumberFormatException ex) {
					view.displayErrorMessage("You need input 2 number!");
				}
			}
		});
	}

}
