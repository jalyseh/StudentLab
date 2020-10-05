import java.util.List;

public class Student extends Person implements Learner{

    public double totalStudyTime;

    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }
    public void learn(double numberOfHours) {

        totalStudyTime = totalStudyTime + numberOfHours;
    }
}
