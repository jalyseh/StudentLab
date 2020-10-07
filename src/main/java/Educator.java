public enum Educator implements Teacher{

    MIKAILA(new Instructor(1L,"Mikaila")),
    CHAD(new Instructor(2L,"Chad")),
    TORRIE(new Instructor(3L,"Torrie")),
    COLLEEN(new Instructor(4L,"Colleen"));


    private final Instructor instructor;
    private double timeWorked;


    Educator(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

        learner.learn(numberOfHours);
        timeWorked += numberOfHours;

    }
    @Override
    public void lecture(Learner[] learner, double numberOfHours) {

        for(Learner currentLearner : learner){
            double numberOfHoursPerLearner = numberOfHours / learner.length;
            currentLearner.learn(numberOfHoursPerLearner);
            timeWorked += numberOfHours;
        }
    }
}
