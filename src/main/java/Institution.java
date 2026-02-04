public class Institution {

    private String name;
    private PersonRepository repository;

    public Institution(String name) {
        this.name = name;
        this.repository = new PersonRepository();
    }

    public void addPerson(Person person) {
        repository.add(person);
    }

    public PersonRepository getRepository() {
        return repository;
    }

    @Override
    public String toString() {
        return "Institution: " + name;
    }
}