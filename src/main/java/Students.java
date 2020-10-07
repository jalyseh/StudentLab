public class Students extends People<Student>{

    private static final Students INSTANCE = new Students();

    private Students() {

        personList.add(new Student(1L, "Ray"));
        personList.add(new Student(2L, "Dean"));
        personList.add(new Student(3L, "Corey"));
        personList.add(new Student(4L, "Darren"));
        personList.add(new Student(5L, "Yas"));
        personList.add(new Student(6L, "Ryan"));
        personList.add(new Student(7L, "Asher"));
        personList.add(new Student(8L, "Dallas"));

    }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        Student[] students = new Student[getPersonList().size()];
        for (int index = 0; index < getPersonList().size(); index++) {
            students[index] = getPersonList().get(index);
        }
        return students;
    }


    @Override
    public String toString() {
        return "StudentsSingleton{" +
                "personList=" + personList +
                '}';
    }

}
