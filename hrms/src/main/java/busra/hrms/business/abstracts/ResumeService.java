package busra.hrms.business.abstracts;

import java.util.List;

import busra.hrms.core.utilities.results.DataResult;
import busra.hrms.core.utilities.results.Result;
import busra.hrms.entities.concretes.Resume;

public interface ResumeService {
	DataResult<List<Resume>> getAll();
	Result add(Resume resume);
}
