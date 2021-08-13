import java.io.*;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-13
 */
public class Log implements Serializable {
    private String name;
    private String date;
    private String content;

    // shallowClone
    private Attachement attachement;
    // shallowClone
    public void setAttachement(Attachement attachement) {
        this.attachement = attachement;
    }
    public String getName() {
        return name;
    }
    // shallowClone
    public Attachement getAttachement() {
        return this.attachement;
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

    // deepClone
    public Log deepClone() throws IOException, ClassNotFoundException, OptionalDataException {

        //Serialization : put object into stream
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        // read object from strom
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Log)ois.readObject();
    }
}
