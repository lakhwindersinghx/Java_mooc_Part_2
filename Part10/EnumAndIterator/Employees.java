import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person item : peopleToAdd) {
            employees.add(item);
        }
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> educationIterator = employees.iterator();
        while (educationIterator.hasNext()) {

            System.out.println(educationIterator.next().getEducation());
        }

    }

    public void fire(Education education) {
        Iterator<Person> fireIterator = employees.iterator();

        while (fireIterator.hasNext()) {
            if (fireIterator.next().getEducation() == education) {
                fireIterator.remove();
            }
        }
    }

}
