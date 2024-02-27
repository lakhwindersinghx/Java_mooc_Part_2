import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personList;

    public Room() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public boolean isEmpty() {
        if (!(this.personList.isEmpty())) {
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<Person> getPersons() {
        ArrayList<Person> people = new ArrayList<>();
        for (Person item : this.personList) {
            people.add(item);
        }
        return people;
    }

    public Person shortest() {
        if (this.personList.isEmpty()) {
            return null;
        }
        Person shortest = this.personList.get(0);
        for (Person item : this.personList) {
            if (shortest.getHeight() > item.getHeight()) {
                shortest = item;
            }
        }
        return shortest;
    }
    public Person take(){
        if (this.personList.isEmpty()) {
            return null;
        }
        Person shortest = this.personList.get(0);
        for (Person item : this.personList) {
            if (shortest.getHeight() > item.getHeight()) {
                shortest = item;
            }
        }
        this.personList.remove(shortest);
        return shortest;
    }

}

