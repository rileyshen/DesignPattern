import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-23
 */
public class BankController {

    private ItemBank itemBank = new ItemBank();

    public BankController() {

        Map<String, String> map01 = new HashMap<>();
        map01.put("A", "JAVA2 EE");
        map01.put("B", "JAVA2 Card");
        map01.put("C", "JAVA2 ME");
        map01.put("D", "JAVA2 HE");
        map01.put("E", "JAVA2 SE");


        Map<String, String> map02 = new HashMap<>();
        map02.put("A", "EE");
        map02.put("B", "Card");
        map02.put("C", "ME");
        map02.put("D", "HE");


        Map<String, String> map03 = new HashMap<>();
        map03.put("A", "ExxE");
        map03.put("B", "Caxxrd");
        map03.put("C", "MExx");
        map03.put("D", "HExx");

        Map<String, String> map04 = new HashMap<>();
        map04.put("A", "E11xxE");
        map04.put("B", "C11axxrd");
        map04.put("C", "M11Exx");
        map04.put("D", "HE11xx");

        Map<String, String> map05 = new HashMap<>();
        map05.put("A", "11E11xxE");
        map05.put("B", "22C11axxrd");
        map05.put("C", "33M11Exx");
        map05.put("D", "44HE11xx");

        itemBank.append(new ChoiceQuestion("quesion1",  map01, "D"))
                .append(new ChoiceQuestion("quesion2", map02, "A"))
                .append(new ChoiceQuestion("quesion3", map03, "D"))
                .append(new ChoiceQuestion("quesion4", map04, "B"))
                .append(new ChoiceQuestion("quesion5", map05, "A"))
                .append(new AnswerQuestion("aquesion1", "D"))
                .append(new AnswerQuestion("aquesion2","A"))
                .append(new AnswerQuestion("aquesion3","D"))
                .append(new AnswerQuestion("aquesion4","B"));


    }

    public String createQuiz(String name, String id) throws CloneNotSupportedException {
        ItemBank itemBank1 = (ItemBank) itemBank.clone();
        itemBank1.setName(name);
        itemBank1.setId(id);
        return itemBank1.toString();
    }

    @Test
    public void test() throws CloneNotSupportedException {
        BankController bankController = new BankController();
        System.out.println(bankController.createQuiz("AA", "001"));
        System.out.println(bankController.createQuiz("BB", "002"));
        System.out.println(bankController.createQuiz("CC", "003"));
    }
}
