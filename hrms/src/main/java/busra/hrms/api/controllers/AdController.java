package busra.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import busra.hrms.business.abstracts.AdService;
import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.Ad;

@RestController
@RequestMapping("/api/ads")
public class AdController {
	
	private AdService adService;
	
	public AdController(AdService adService) {
		super();
		this.adService = adService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Ad>> getAll(){
		return this.adService.getAll();
	}
	
	@GetMapping("/getAllActive")
	public DataResult<List<Ad>> getAllActive(){
		return this.adService.getAllActive();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Ad ad) {
		return this.adService.add(ad);
	}
	
	@GetMapping("/getByStatusTrue")
	public DataResult<List<Ad>> getByStatusTrue() {
		return this.adService.getByStatusTrue();
	}
	
	@GetMapping("/getByStatusTrueOrderByDeadline")
	public DataResult<List<Ad>> getByStatusTrueOrderByDeadline() {
		return this.adService.getByStatusTrueOrderByDeadline();
	}
	
	@GetMapping("/getByStatusTrueAndEmployerId")
	public DataResult<List<Ad>> getByStatusTrueAndEmployerId(@RequestParam(value = "employerId") int employerId) {
		return this.adService.getByStatusTrueAndEmployerId(employerId);
	}
	
	@PutMapping("/updateStatus")
    public Result updateStatus(@RequestParam(value = "status") boolean status, @RequestParam(value = "id") int id){
        return this.adService.updateStatus(status, id);
	}
}
