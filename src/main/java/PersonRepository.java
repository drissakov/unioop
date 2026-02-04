import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonRepository {

    private List<Person> people = new ArrayList<>();

    public void add(Person person) {
        people.add(person);
    }

    public List<Person> getAll() {
        return new ArrayList<>(people);
    }

    public Person findByName(String name) {
        for (Person p : people) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public List<Person> filterByAge(int minAge) {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() >= minAge) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> sortByName() {
        List<Person> sorted = new ArrayList<>(people);
        sorted.sort(Comparator.comparing(Person::getName));
        return sorted;
    }
}