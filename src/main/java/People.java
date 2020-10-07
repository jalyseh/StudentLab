import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<Person>{

    List<E> personList = new ArrayList<E>();

    public People(){

    }

    public People(List<E> personList) {
        this.personList = personList;
    }

    public List<E> getPersonList() {
        return personList;
    }

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {

        for (E person : personList) {
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

    public void remove(Person person) {

        personList.remove(person);
    }

    public void remove(long id) {

        for (int index = 0; index < personList.size(); index++) {
            if (personList.get(index).getId() == id) {
                personList.remove(personList.get(index));
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public abstract E[] toArray();

    public Iterator iterator(){
     return personList.iterator();
    }

    @Override
    public String toString() {
        return "People{" +
                "personList=" + personList +
                '}';
    }
}


