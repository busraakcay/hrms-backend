package busra.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import busra.hrms.business.abstracts.ResumeInfoService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.ResumeInfo;

@RestController
@RequestMapping("/api/resumeInfos")
public class ResumeInfosController {
	
	private ResumeInfoService resumeInfoService;

	public ResumeInfosController(ResumeInfoService resumeInfoService) {
		super();
		this.resumeInfoService = resumeInfoService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeInfo>> getAll(){
		return this.resumeInfoService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ResumeInfo resumeInfo) {
		return this.resumeInfoService.add(resumeInfo);
	}
	
}
