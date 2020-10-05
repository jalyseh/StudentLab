import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{

    List<Person> personList;

    public People(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public List<Person> add(Person person) {
        personList.add(person);
        return personList;
    }

    public Person findById(long id) {

        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        if (personList.contains(person)) {
            return true;
        } else {
            return false;
        }
    }

    public void remove1(Person person) {

        personList.remove(person);
    }

    public void remove(long id) {

        for (Person person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }
    public Person[] toArray(){
       return (Person[]) personList.toArray();
    }
    public Iterator<Person> iterator(){
     return personList.iterator();
    }

    @Override
    public String toString() {
        return "People{" +
                "personList=" + personList +
                '}';
    }
}


