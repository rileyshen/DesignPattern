import java.io.Serializable;

/**
 * @Description: deepClone:Serialization
 * @Author RileyShen
 * @Create 2021-08-13
 */
public class Attachement implements Serializable {
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void download() {
        System.out.println("the file name is : " + name);
    }
}
