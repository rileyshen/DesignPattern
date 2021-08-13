/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-13
 */
public class Attachement {
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
