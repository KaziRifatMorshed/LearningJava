package Interface.Quix_again;

public class Question implements Complexity {
    String ques, ans;
    int diff;

    public Question(String q, String a) {
        ques = q;
        ans = a;
        diff = 0;
    }

    public String getQuestion() {
        return ques;
    }

    public String getAnswer() {
        return ans;
    }

    public boolean answerCorrect(String i) {
        // return (ans == i); NOT GOOD
        return ans.equals(i);
    }

    @Override
    public void setComplexity(int i) {
        diff = i;
    }

    @Override
    public int getComplexity() {
        return diff;
    }
} // DONE