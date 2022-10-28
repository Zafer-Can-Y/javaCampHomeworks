package kodlama.io.Kodlama.io.Devs.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgramminLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgramminLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.remove(programmingLanguage.getId() - 1);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		for (ProgrammingLanguage pLanguage : programmingLanguages) {
			if (pLanguage.getId() == programmingLanguage.getId()) {
				pLanguage.setLanguageName(programmingLanguage.getLanguageName());
			}
		}
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}
	
	@Override
	public ProgrammingLanguage findById(int id) {
		ProgrammingLanguage pL = null;
		for(ProgrammingLanguage pLanguage : programmingLanguages ) {
			if(pLanguage.getId() == id) {
				pL = pLanguage;
			}
		}
		return pL;
	}

}
