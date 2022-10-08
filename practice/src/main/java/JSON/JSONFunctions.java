package JSON;

import com.jayway.jsonpath.JsonPath;

import java.util.Map;

public class JSONFunctions {
    public static int countJsonRows(String json){
        int res = 0;
        Map<String, String> objectMap = JsonPath.read(json, "$.results..id");
        res =  objectMap.keySet().size();
        return res;
    }

    public static void main(String[] args) {

        System.out.println(  "Interface error on route " +
                null + "_" + null +
                ", id: " +
               null);

    }
}
