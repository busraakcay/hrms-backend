package busra.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import busra.hrms.business.abstracts.PersonnelService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.Personnel;


@RestController
@RequestMapping("/api/personnel")
public class PersonnelController {
	
	private PersonnelService personnelService;
	
	public PersonnelController(PersonnelService personnelService) {
		super();
		this.personnelService = personnelService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Personnel>> getAll() {
		return this.personnelService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Personnel personnel) {
		return this.personnelService.add(personnel);
	}

}
