import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-23
 */
public class ItemBank implements Cloneable{

    private String name;
    private String id;

    private ArrayList<ChoiceQuestion> choiceQuestions = new ArrayList<>();
    private ArrayList<AnswerQuestion> answerQuestions = new ArrayList<>();

    public ItemBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestions.add(choiceQuestion);
        return this;
    }

    public ItemBank append(AnswerQuestion answerQuestion) {
        answerQuestions.add(answerQuestion);
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ItemBank itemBank = (ItemBank) super.clone();
        itemBank.choiceQuestions = (ArrayList<ChoiceQuestion>) choiceQuestions.clone();
        itemBank.answerQuestions = (ArrayList<AnswerQuestion>) answerQuestions.clone();

        Collections.shuffle(itemBank.choiceQuestions);
        Collections.shuffle(itemBank.answerQuestions);

        ArrayList<ChoiceQuestion> choiceQuestions = itemBank.choiceQuestions;
        for (ChoiceQuestion question : choiceQuestions) {
            Topic random = TopicRandom.random(question.getOptions(), question.getAnswer());
            question.setOptions(random.getOptions());
            question.setAnswer(random.getAnswer());
        }
        return itemBank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {

        StringBuilder detail = new StringBuilder("candidate: " + name + "\r\n" +
                "id: " + id + "\r\n" +
                "---------------------------\r\n" +
                "1. CHOISE" + "\r\n"

        );

        // choice quiz and answer

        for (int idx = 0; idx < choiceQuestions.size(); idx++) {
            detail.append(idx + 1).append(": ").append(choiceQuestions.get(idx).getQuestion()).append("\r\n");


            Map<String, String> option = choiceQuestions.get(idx).getOptions();

            for (String key : option.keySet()) {
                detail.append(key).append(": ").append(option.get(key)).append("\r\n");
            }
            detail.append("answer: ").append(choiceQuestions.get(idx).getAnswer()).append("\r\n\n");
        }

        // answer quiz and answer
        detail.append("2.Answer: " + "\r\n\n");

        for (int idx = 0; idx < answerQuestions.size(); idx++) {
            detail.append(idx + 1).append(answerQuestions.get(idx).getQuestion()).append("\r\n");

            detail.append("answer: ").append(answerQuestions.get(idx).getAnswer()).append("\r\n\n");
        }
        return detail.toString();

    }
}
