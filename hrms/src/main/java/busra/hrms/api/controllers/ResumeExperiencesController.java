package busra.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import busra.hrms.business.abstracts.ResumeExperienceService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.ResumeExperience;

@RestController
@RequestMapping("/api/resumeExperiences")
public class ResumeExperiencesController {
	
	private ResumeExperienceService resumeExperienceService;

	public ResumeExperiencesController(ResumeExperienceService resumeExperienceService) {
		super();
		this.resumeExperienceService = resumeExperienceService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeExperience>> getAll(){
		return this.resumeExperienceService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ResumeExperience resumeExperience) {
		return this.resumeExperienceService.add(resumeExperience);
	}
}
