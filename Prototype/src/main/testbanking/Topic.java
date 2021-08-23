import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
    private Map<String, String> options;
    private String answer;


}
