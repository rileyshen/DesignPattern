/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-14
 */
public class FAR implements OfficialDocu{



    public OfficialDocu clone() {
        OfficialDocu far = null;

        try {
            far = (OfficialDocu) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("Feasibility Analysis Report analysis");
    }
}
