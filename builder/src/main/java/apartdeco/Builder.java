package apartdeco;

import apartdeco.ceiling.LevelOneCeiling;
import apartdeco.ceiling.LevelTwoCeiling;
import apartdeco.floor.LevelOneFloor;
import apartdeco.floor.LevelTwoFloor;
import apartdeco.tile.LevelOneTile;
import apartdeco.tile.LevelTwoTile;
import org.junit.jupiter.api.Test;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-13
 */
public class Builder {

    public Imenu packageOne (Double area) {
        return new Deco(area, "CLASSIC")
                .appendCeiling(new LevelOneCeiling())
                .appendFloor(new LevelOneFloor())
                .appendTile(new LevelOneTile());
    }

    public Imenu packageTwo (Double area) {
        return new Deco(area, "MODERN")
                .appendCeiling(new LevelOneCeiling())
                .appendFloor(new LevelTwoFloor())
                .appendTile(new LevelTwoTile());
    }

    public Imenu packageThree (Double area) {
        return new Deco(area, "ART")
                .appendCeiling(new LevelTwoCeiling())
                .appendFloor(new LevelTwoFloor())
                .appendTile(new LevelTwoTile());
    }


    @Test
    public void test_Builder() {
        Builder builder = new Builder();

        System.out.println(builder.packageTwo(140D).getDetail());

        System.out.println(builder.packageOne(140D).getDetail());

        System.out.println(builder.packageThree(140D).getDetail());


    }

}


