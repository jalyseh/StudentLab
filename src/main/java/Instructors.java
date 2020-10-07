public class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){

        personList.add(Educator.MIKAILA.getInstructor());
        personList.add(Educator.CHAD.getInstructor());
        personList.add(Educator.TORRIE.getInstructor());
        personList.add(Educator.COLLEEN.getInstructor());
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray(){
        Instructor[] instructors = new Instructor[getPersonList().size()];
        for(int index = 0; index < getPersonList().size(); index++){
            instructors[index] = getPersonList().get(index);
        }
        return instructors;
    }
}
