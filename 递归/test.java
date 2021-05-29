import java.util.*;

public class test {
    public  static Map fmap = new HashMap() {{
        put("id", 1);
        put("pid", 0);
    }};
    public static void main(String args[]){
        List<Map<String,Object>> data = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("id",1);
        map.put("pid",0);
        data.add(map);
        Map<String,Object> map2 = new HashMap<>();
        map2.put("id",2);
        map2.put("pid",1);
        data.add(map2);
        Map<String,Object> map3 = new HashMap<>();
        map3.put("id",3);
        map3.put("pid",1);
        data.add(map3);
        Map<String,Object> map4 = new HashMap<>();
        map4.put("id",4);
        map4.put("pid",2);
        data.add(map4);
        dg(fmap,data);
        System.out.println(fmap);
    }
    public static void dg(Map<String,Object> fMap,List<Map<String,Object>> data){
        List<Map<String,Object>> child = new ArrayList<>();
        for(Map<String,Object> dmap:data){
            if(fMap.get("id")==dmap.get("pid")){
                child.add(dmap);
            }
        }
        if(child==null){
            return;
        }
        fMap.put("child",child);
        List<Map<String,Object>> childmap = (List<Map<String, Object>>) fMap.get("child");
        for(Map<String,Object> ctf:childmap){
            dg(ctf,data);
        }
    }

}
