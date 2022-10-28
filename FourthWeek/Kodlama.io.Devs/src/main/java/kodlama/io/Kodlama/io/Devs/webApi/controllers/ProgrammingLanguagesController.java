package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController // annotation
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguageService.add(programmingLanguage);
	}

	@DeleteMapping("/delete")
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.delete(programmingLanguage);
	}

	@PutMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguageService.update(programmingLanguage);
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageService.getAll();
	}

	@GetMapping("/findbyid")
	public ProgrammingLanguage findById(int id) {
		return programmingLanguageService.findById(id);
	}
}
