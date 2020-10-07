import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testImplementation(){

        Educator test = Educator.MIKAILA;

        Assert.assertTrue(test instanceof Teacher);
    }

    @Test
    public void testTeach(){
        Student student = new Student(1234, "Helen");
        Educator test = Educator.MIKAILA;
        test.teach(student,10);

        double expected = student.getTotalStudyTime();
        double actual = 10.0;
        double delta = 0.0;

        Assert.assertEquals(expected,actual,delta);

    }
    @Test
    public void testLecture(){

        Student student1 = new Student(1234, "Helen");
        Student student2 = new Student(1235, "Adam");

        Learner[] learners = new Learner[2];
        learners[0] = student1;
        learners[1] = student2;

        Educator test = Educator.MIKAILA;
        test.lecture(learners,20);

        double expected = (student1.getTotalStudyTime() + student2.getTotalStudyTime()) / learners.length;
        double actual = 10.0;




    }

}
