import org.junit.Assert;
import org.junit.Test;

public class TestZipcodeWilmington {

    @Test
    public void testHostLecture() {

        ZipcodeWilmington zipcodeWilmington = ZipcodeWilmington.getINSTANCE();

        zipcodeWilmington.hostLecture(1L, 16);

        double expected = 2.0;

        Student test = zipcodeWilmington.getStudents().findById(7L);

        double actual = test.getTotalStudyTime();

        double delta = 0.0;

        Assert.assertEquals(expected, actual, delta);

    }
}
