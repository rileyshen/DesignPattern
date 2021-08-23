import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswerQuestion {

    private String question;

    private String answer;

}