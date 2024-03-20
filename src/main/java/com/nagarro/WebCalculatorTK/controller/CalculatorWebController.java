package com.nagarro.WebCalculatorTK.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nagarro.WebCalculatorTK.model.CalculatorForm;

@Controller
public class CalculatorWebController {

	@GetMapping("/web")
	public String showForm() {
		return "calculator-form";
	}

	@PostMapping("/calculate")
	public String calculate(@ModelAttribute CalculatorForm form) {
		int num1 = form.getNum1();
		int num2 = form.getNum2();
		String action = form.getAction();

		if (action.equals("add")) {
			return "redirect:/controller/add/" + num1 + "/" + num2;
		} else if (action.equals("difference")) {
			return "redirect:/controller/difference/" + num1 + "/" + num2;
		} else if (action.equals("multiply")) {
			return "redirect:/controller/multiply/" + num1 + "/" + num2;
		} else if (action.equals("divide")) {
			return "redirect:/controller/divide/" + num1 + "/" + num2;
		} else {
			return "redirect:/web";
		}
	}

}
