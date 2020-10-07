import java.util.HashMap;

public class ZipcodeWilmington {

    private static final ZipcodeWilmington INSTANCE = new ZipcodeWilmington();
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private ZipcodeWilmington(){

    }

    public static ZipcodeWilmington getINSTANCE(){
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {

        teacher.lecture(students.toArray(), numberOfHours);
    }
    public void hostLecture(long id, double numberOfHours){

        instructors.findById(id).lecture(students.toArray(), numberOfHours);
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
    public HashMap<Student, Double> getStudyMap(){
        HashMap studyMap = new HashMap<Student, Double>();
        for(Student student : students.getPersonList()){
            studyMap.put(student,student.getTotalStudyTime());
        }
        return studyMap;
    }
}
