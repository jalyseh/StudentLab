import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {

    @Test
    public void getInstance(){

        List<Instructor> defaultList = new ArrayList<Instructor>();
        defaultList.add(new Instructor(1L,"Mikaila"));
        defaultList.add(new Instructor(2L,"Chad"));
        defaultList.add(new Instructor(3L,"Torrie"));
        defaultList.add(new Instructor(4L,"Colleen"));

        List<Instructor> expected = defaultList;
        List<Instructor> actual = Instructors.getInstance().getPersonList();

        Assert.assertEquals(expected.toString(),actual.toString());

    }
}

