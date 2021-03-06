import java.io.IOException;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-13
 */
public class Client {
    public static void main(String[] args) {
        Log log = new Log();

        log.setContent("aa");
        log.setDate("week 12");
        log.setName("big A");

        // shallowClone
        Attachement attachement = new Attachement();
        log.setAttachement(attachement);

        System.out.println("name: " + log.getName());
        System.out.println("week: " + log.getDate());
        System.out.println("content: " + log.getContent());

        Log  log2 = new Log();
        try {
           log2 = log.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        log2.setContent("bb");
        log2.setDate("week 13");
        log2.setName("big b");
        System.out.println("---------------------");
        System.out.println("name: " + log2.getName());
        System.out.println("week: " + log2.getDate());
        System.out.println("content: " + log2.getContent());

        System.out.println("---------------------");
        System.out.println(log == log2);
        System.out.println(log.getDate() == log2.getName());
        System.out.println(log.getContent() == log2.getContent() );
        System.out.println(log.getAttachement() == log2.getAttachement() ); // true : // shallowClone: int、double、byte、boolean、char
    }
}
