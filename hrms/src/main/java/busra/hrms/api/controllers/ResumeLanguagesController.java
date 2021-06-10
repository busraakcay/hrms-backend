package busra.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import busra.hrms.business.abstracts.ResumeLanguageService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.ResumeLanguage;

@RestController
@RequestMapping("/api/resumeLanguages")
public class ResumeLanguagesController {
	
	private ResumeLanguageService resumeLanguageService;

	public ResumeLanguagesController(ResumeLanguageService resumeLanguageService) {
		super();
		this.resumeLanguageService = resumeLanguageService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeLanguage>> getAll(){
		return this.resumeLanguageService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ResumeLanguage resumeLanguage) {
		return this.resumeLanguageService.add(resumeLanguage);
	}
	
}
