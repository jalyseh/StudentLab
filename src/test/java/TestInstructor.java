import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){

        Instructor instructor = new Instructor(0,"");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){

        Instructor instructor = new Instructor(0,"");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student = new Student(1234, "Helen", 5);
        Instructor instructor = new Instructor(0,"");
        instructor.teach(student,10);

        double expected = student.getTotalStudyTime();
        double actual = 15.0;
        double delta = 0.0;

        Assert.assertEquals(expected,actual,delta);

    }
    @Test
    public void testLecture(){

        Student student1 = new Student(1234, "Helen", 5);
        Student student2 = new Student(1235, "Adam", 6);

        Learner[] learners = new Learner[2];
        learners[0] = student1;
        learners[1] = student2;

        Instructor instructor = new Instructor(0,"");
        instructor.lecture(learners,20);

        double expected = (student1.getTotalStudyTime() + student2.getTotalStudyTime()) / learners.length;
        double actual = 10.0;




    }

}
