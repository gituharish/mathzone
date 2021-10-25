package com.example.mathzone.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.mathzone.model.ProblemResponse;
import com.example.mathzone.service.ProblemSolverService;

@RestController
public class ProblemSolverController {
	
	
	public ProblemSolverService problemSolverService;

	@Autowired
	public void setProblemSolverService(ProblemSolverService problemSolverService) {
		this.problemSolverService = problemSolverService;
	}
	
	@Value("${app.version}")
	private String appVersion;
	
	@GetMapping
	@RequestMapping("/")
	public Map<String, String> getStatus() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("app-version", appVersion);
		return map;
		
		}


	@GetMapping("/api/v1/getSmallestDivisibleNum/{num}")
	public ProblemResponse getSolution(@PathVariable String num) {
		ProblemResponse response = new ProblemResponse();
		try {
			String answer = problemSolverService.getSmallestNumberEvenlydivisible(num);
			response.setProblem(num);
			response.setSolution(answer);

		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
		}

		return response;

	}

}
