package kodlama.io.Kodlama.io.Devs.dataAcces.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	void add(ProgrammingLanguage programmingLanguage);

	void delete(ProgrammingLanguage programmingLanguage);

	void update(ProgrammingLanguage programmingLanguage);

	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage findById(int id);
}
