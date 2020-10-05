import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    @Test
    public void testAdd() {

        Person person1 = new Person(222, "Neyo");

        List<Person> listOfPeople = new ArrayList<Person>();

        List<Person> defaultList = new ArrayList<Person>();
        defaultList.add(person1);

        People people = new People(listOfPeople);
        people.add(person1);

        List<Person> expected = defaultList;
        List<Person> actual = people.getPersonList();

       Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove() {

        Person person1 = new Person(222, "Neyo");

        List<Person> listOfPeople = new ArrayList<Person>();
        listOfPeople.add(person1);

        List<Person> defaultList = new ArrayList<Person>();

        People people = new People(listOfPeople);
        people.remove1(person1);

        List<Person> expected = defaultList;
        List<Person> actual = people.getPersonList();

        Assert.assertEquals(expected,actual);

        }
        @Test
        public void testFindById(){
            Person person1 = new Person(222, "Neyo");
            List<Person> peopleList = new ArrayList<Person>();
            peopleList.add(person1);

            People people = new People(peopleList);

            people.findById(222);

            Person expected = person1;
            Person actual = people.findById(222);

        }
    }
