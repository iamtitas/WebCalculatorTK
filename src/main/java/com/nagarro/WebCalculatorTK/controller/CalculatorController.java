package com.nagarro.WebCalculatorTK.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/controller")
public class CalculatorController {

	@GetMapping("/add/{num1}/{num2}")
	@ResponseBody
	public String add(@PathVariable String num1, @PathVariable String num2) {
		try {
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			return "Result: " + (n1 + n2);
		} catch (NumberFormatException e) {
			return "Error: Enter a number";
		}
	}

	@GetMapping("/difference/{num1}/{num2}")
	@ResponseBody
	public String difference(@PathVariable String num1, @PathVariable String num2) {
		try {
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			return "Result: " + (n1 - n2);
		} catch (NumberFormatException e) {
			return "Error: Enter a number";
		}
	}

	@GetMapping("/multiply/{num1}/{num2}")
	@ResponseBody
	public String multiply(@PathVariable String num1, @PathVariable String num2) {
		try {
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			return "Result: " + (n1 * n2);
		} catch (NumberFormatException e) {
			return "Error: Enter a number";
		}
	}

	@GetMapping("/divide/{num1}/{num2}")
	@ResponseBody
	public String divide(@PathVariable String num1, @PathVariable String num2) {
		try {
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			if (n2 == 0) {
				return "Error: Division by zero";
			}
			return "Result: " + ((double) n1 / n2);
		} catch (NumberFormatException e) {
			return "Error: Enter a number";
		}
	}

}
