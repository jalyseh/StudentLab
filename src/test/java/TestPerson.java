import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {

        Person person = new Person(5555, "Helen");

        String expected = person.getName();
        String actual = "Helen";

        long expected1 = person.getId();
        long actual1 = 5555;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected1, actual1);
    }
      @Test
      public void testSetName(){
            Person person = new Person(5555, "");
            person.setName("Helen");

            String expected = person.getName();
            String actual = "Helen";

            Assert.assertEquals(expected,actual);
        }
}

