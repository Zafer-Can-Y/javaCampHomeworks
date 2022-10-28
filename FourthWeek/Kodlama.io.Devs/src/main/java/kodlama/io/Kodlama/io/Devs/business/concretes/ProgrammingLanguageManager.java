package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		if (programmingLanguage.getLanguageName().isEmpty()) {
			throw new Exception("Dil adı boş bırakılamaz!");
		}
		for (ProgrammingLanguage pLanguage : this.programmingLanguageRepository.getAll()) {
			if (pLanguage.getLanguageName().equals(programmingLanguage.getLanguageName())) {
				throw new Exception(pLanguage.getLanguageName() + " zaten mevcut!");
			}
		}
		programmingLanguageRepository.add(programmingLanguage);
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.delete(programmingLanguage);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.update(programmingLanguage);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage findById(int id) {
		return programmingLanguageRepository.findById(id);
	}

}
