
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import java.util.ArrayList;
import org.json.JSONException;

public class Logger {

    public static void main(String[] args) throws JSONException {
        System.out.println("Welcome Home\n----------");
        String myNames[] = {"Kelvin","Kario","Muthoni","0704219247"};
        String arrayString = "[\"kevokario\",\"2300\",\"23\",\"[\\\"kenya\\\",\\\"nairobi\\\",\\\"kikuyu\\\"]\"]";
        System.out.print("========\n"+new myHTTPClass().ArrayToString(myNames)+"\n========\n");
        ArrayList<Object> fb = new ArrayList<>();
        fb = new myHTTPClass().StringToArray(arrayString);
        for (Object object : fb) {
            System.out.println(object);
        }
        System.out.println("-----------------\n\n");
        myHTTPClass ht = new myHTTPClass("http://localhost:8080/Demos/mimic.php?catGet=test", "");
        ht.sendGet();
        
         System.out.println("-----------With content------");
        myHTTPClass ht1 = new myHTTPClass();
        Object[] obj = {6};
        String json = ht1.ArrayToString(obj);
        ht1.setUrl("http://localhost:8080/Demos/mimic.php?catGet=information&jsonData="+json);
        ht1.sendGet();
        
    }

    //this function uses GET to send data to the server
    public void sendGet() {
        String getString = "http://localhost:8080/Demos/mimic.php?catGet=test";
        String data = "";
        int ResponseCode = 0;

        try {
            URL url = new URL(getString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(7000);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            ResponseCode = conn.getResponseCode();

            InputStream in = new BufferedInputStream(conn.getInputStream());
            String result = IOUtils.toString(in);

            Object object = JSONValue.parse(result);
            JSONArray json = (JSONArray) object;
            int count = json.size();
            for (int a = 0; a < count; a++) {
                System.out.println(json.get(a));
            }
            
            Object objectAddress = JSONValue.parse((String)json.get(3));
            JSONArray jsonAddress = (JSONArray) objectAddress;
            for(int a = 0; a<jsonAddress.size();a++){
                System.out.print(jsonAddress.get(a)+" ");
            }

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
    
}
