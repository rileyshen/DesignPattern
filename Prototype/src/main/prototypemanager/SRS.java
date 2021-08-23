/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-14
 */
public class SRS implements OfficialDocu{
    @Override
    public OfficialDocu clone() {
        OfficialDocu srs = null;
        try {
            srs = (OfficialDocu) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("Software Requirements Specification analysis");
    }
}
