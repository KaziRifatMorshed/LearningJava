package Interface.Quiz;

import java.util.Objects;

public class Question implements Quiz.Complexity {
    protected String question, answer;
    protected int complexity_level;

    public Question(String q, String a) {
        question = q;
        answer = a;
        complexity_level = 1;
    }

    public void setComplexity(int n) {
        complexity_level = n;
    }

    public int getComplexity() {
        return complexity_level;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    // DIFFICULT
    public boolean answerCorrect(String p) {
        return (Objects.equals(this.answer, p));
    }

    public void setComplexity_level(int complexity_level) {
        this.complexity_level = complexity_level;
    }
}
