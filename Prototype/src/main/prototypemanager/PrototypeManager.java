import java.util.HashMap;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-14
 */
public class PrototypeManager {

//    private HashMap hashMap = new HashMap();
//    private static PrototypeManager pm = new PrototypeManager();
//
//    private PrototypeManager() {
//
//        hashMap.put("far", new FAR());
//        hashMap.put("far", new SRS());
//    }
//
//    public void addOfficialDocu(String key, OfficialDocu doc) {
//        hashMap.put(key, doc);
//    }
//
//    //shallowClone
//    public OfficialDocu getOffDocu(String key) {
//        return ((OfficialDocu) hashMap.get(key)).clone();
//    }
//
//    public static PrototypeManager getPrototypeManager() {
//        return pm;
//    }



//    private HashMap<String, ProtoType> mProtos = new HashMap<>();
//
//    public ProtoType getProto(Class<? extends ProtoType> type) {
//        if (mProtos.get(type.getClass().getSimpleName()) == null) {
//                try {
//                    mProtos.put(type.getSimpleName(), type.newInstance());
//                } catch (InstantiationException | IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        return mProtos.get(type.getSimpleName());
//    }

}
