public class Exam extends Assessment {

    // Private data fields
    private int numQuestions;
    private int numMissed;
    private int pointsEach;

    // Constructor
    public Exam(int questions, int missed) {
        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100 / numQuestions;

        // calculate score
        int correct = numQuestions - numMissed;
        int score = (int)Math.round((double)correct * 100 / numQuestions);

        setScore(score);
    }

    public int getPointsEach() {
        return pointsEach;
    }
    public int getNumMissed() {
        return numMissed;
    }
}
