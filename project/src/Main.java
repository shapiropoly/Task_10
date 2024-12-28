public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		University university = new University();

		Employee dean = new AdministrativeEmployee(932, "Ваня Сидоров", "sidorov@example.com");

		Faculty faculty = new Faculty("Факультет компьютерных наук", dean);
		university.addFaculty(faculty);

		Institute institute = new Institute("Программистов", "Московский проспект, д. 60");
		faculty.addInstitute(institute);

		ResearchAssociate researcher = new ResearchAssociate(172, "Катя Петрова", "petrova@example.com", "МИСПИС");
		institute.setResearchAssociate(researcher);

		university.displayFaculties();
		faculty.displayInstitutes();
	}

}