import java.util.*;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-23
 */
public class TopicRandom {
    static public Topic random(Map<String, String> option, String answer) {
        Set<String> keySet = option.keySet();
        List<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<>();

        int idex = 0;
        String ansNew = "";
        for (String next : keySet) {
            String randomKey = keyList.get(idex++);
            if (answer.equals(next)) {
                ansNew = randomKey;
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, ansNew);
    }
}
