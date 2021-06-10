package busra.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import busra.hrms.business.abstracts.ResumeEducationService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.ResumeEducation;

@RestController
@RequestMapping("/api/resumeEducations")
public class ResumeEducationsController {
	
	private ResumeEducationService resumeEducationService;

	public ResumeEducationsController(ResumeEducationService resumeEducationService) {
		super();
		this.resumeEducationService = resumeEducationService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeEducation>> getAll(){
		return this.resumeEducationService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ResumeEducation resumeEducation) {
		return this.resumeEducationService.add(resumeEducation);
	}
	
}
