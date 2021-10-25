package com.example.mathzone;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mathzone.web.ProblemSolverController;

@SpringBootTest
class MathzoneApplicationTests {

	@Autowired
	private ProblemSolverController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
