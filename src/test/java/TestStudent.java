import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){

        Student student = new Student(1234, "Helen",5.5);

        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance(){

        Student student = new Student(1234, "Helen",5.5);

        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        Student student = new Student(1234, "Helen",5.0);
        student.learn(5.0);

        double expected = student.getTotalStudyTime();
        double actual = 10.0;
        double delta = 0;

      Assert.assertEquals(expected,actual,delta);
    }
}
