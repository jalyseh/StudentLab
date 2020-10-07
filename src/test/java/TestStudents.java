import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {

    @Test
    public void testStudents(){

        List<Student> defaultList = new ArrayList<Student>();
        defaultList.add(new Student(1,"Ray"));
        defaultList.add(new Student(2,"Dean"));
        defaultList.add(new Student(3,"Corey"));
        defaultList.add(new Student(4,"Darren"));
        defaultList.add(new Student(5,"Yas"));
        defaultList.add(new Student(6,"Ryan"));
        defaultList.add(new Student(7,"Asher"));
        defaultList.add(new Student(8,"Dallas"));

        List<Student> expected = defaultList;
        List<Student> actual = Students.getInstance().getPersonList();

        Assert.assertEquals(expected.toString(),actual.toString());

    }
}
