public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours){

        learner.learn(numberOfHours);

    }
    public void lecture(Learner[] learner, double numberOfHours){

        for(Learner currentLearner : learner){
            double numberOfHoursPerLearner = numberOfHours / learner.length;
            currentLearner.learn(numberOfHoursPerLearner);

        }
    }
}

