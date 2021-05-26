package busra.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import busra.hrms.business.abstracts.UnemployedService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.Unemployed;

@RestController
@RequestMapping("/api/unemployeds")
public class UnemployedController {
	
	private UnemployedService unemployedService;
	
	public UnemployedController(UnemployedService unemployedService) {
		super();
		this.unemployedService = unemployedService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Unemployed>> getAll() {
		return this.unemployedService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Unemployed unemployed) {
		return this.unemployedService.add(unemployed);
	}
	
}
