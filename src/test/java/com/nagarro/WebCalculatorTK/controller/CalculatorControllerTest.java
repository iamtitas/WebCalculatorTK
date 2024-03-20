package com.nagarro.WebCalculatorTK.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testAdd() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/controller/add/5/4").accept(MediaType.TEXT_PLAIN))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Result: 9"));
	}

	@Test
	public void testDifference() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/controller/difference/5/4").accept(MediaType.TEXT_PLAIN))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Result: 1"));
	}

	@Test
	public void testMultiply() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/controller/multiply/5/4").accept(MediaType.TEXT_PLAIN))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Result: 20"));
	}

	@Test
	public void testDivide() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/controller/divide/10/2").accept(MediaType.TEXT_PLAIN))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Result: 5.0"));
	}

	@Test
	public void testDivideByZero() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/controller/divide/10/0").accept(MediaType.TEXT_PLAIN))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Error: Division by zero"));
	}
}
