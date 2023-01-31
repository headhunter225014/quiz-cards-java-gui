public class QuizCard
{
    public String question;
    public String answer;

    public QuizCard(String question, String answer)
    {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}