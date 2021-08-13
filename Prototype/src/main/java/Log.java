/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-13
 */
public class Log implements Cloneable{
    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Log clone() {


        try {

            return (Log)super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }
        return null;
    }
}
