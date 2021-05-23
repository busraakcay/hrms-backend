package busra.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import busra.hrms.business.abstracts.PositionService;
import busra.hrms.entities.concretes.Position;


@RestController
@RequestMapping("/api/positions")
public class PositionController {
	
	private PositionService positionService;
	
	public PositionController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
	
	@GetMapping("/getall")
	public List<Position> getAll() {
		return this.positionService.getAll();
	}

}