package model;

import java.util.HashMap;
import java.util.Map;

public class SimpleDic {
    Map<String,String> minidic = new HashMap<>();

    public Map<String, String> getMinidic() {
        this.init();
        return minidic;
    }
    public void init(){
        minidic.put("hello","xin chào");
        minidic.put("clock","đồng hồ");
        minidic.put("watch","đồng hồ");
        minidic.put("bridge","cây cầu");
        minidic.put("car","ô tô");
    }


}
