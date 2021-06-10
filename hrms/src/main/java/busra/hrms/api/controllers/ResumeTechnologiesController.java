package busra.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import busra.hrms.business.abstracts.ResumeTechnologyService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.ResumeTechnology;

@RestController
@RequestMapping("/api/resumeTechnologies")
public class ResumeTechnologiesController {
	
	private ResumeTechnologyService resumeTechnologyService;

	public ResumeTechnologiesController(ResumeTechnologyService resumeTechnologyService) {
		super();
		this.resumeTechnologyService = resumeTechnologyService;
	}

	@GetMapping("/getall")
	public DataResult<List<ResumeTechnology>> getAll(){
		return this.resumeTechnologyService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ResumeTechnology resumeTechnology) {
		return this.resumeTechnologyService.add(resumeTechnology);
	}
	
}
