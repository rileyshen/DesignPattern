package builder1;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-10
 */
public class DirectorFactory {

    private PersonBuilder pb;

    public DirectorFactory(PersonBuilder pb) {
        this.pb = pb;
    }

    public void createPerson() {
        pb.buildHeard();
        pb.buildBody();
        pb.buildArmLeft();
        pb.buildArmRight();
        pb.buildLegLeft();
        pb.buildLegRight();
    }
}
