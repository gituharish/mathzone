package com.example.mathzone.web;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.mathzone.service.ProblemSolverService;

@WebMvcTest(ProblemSolverController.class)
public class ProblemSolverControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ProblemSolverService service;

	@Test
	public void test_ShouldReturnMessageFromService() throws Exception {
		when(service.getSmallestNumberEvenlydivisible("25")).thenReturn("26771144400");
		
		this.mockMvc.perform(get("/api/v1/getSmallestDivisibleNum/25")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().json("{'problem':'25', 'solution':'26771144400'}"));
		
	}
	
}