
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.io.IOUtils;
//import org.json.simple.JSONArray;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONValue;

public class myHTTPClass {

    private String url = "";
    private String data = "";

    public myHTTPClass() {
        this.url = "undefined";
        this.data = "undefined";
    }

    public myHTTPClass(String url, String data) {
        this.data = data;
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getdata() {
        return this.data;
    }

    public String getUrl() {
        return this.url;
    }

    public String ArrayToString(Object[] data) {
        String jsonString = "";
        jsonString = new JSONArray(Arrays.asList(data)).toString();
        return jsonString;
    }

    public ArrayList<Object> StringToArray(String arrayString) throws JSONException {
        ArrayList<Object> myarr = new ArrayList<>();
        Object object = JSONValue.parse(arrayString);
        JSONArray json = new JSONArray(arrayString);
        for (int a = 0; a < json.length(); a++) {
            myarr.add(json.get(a));
        }
        return myarr;

    }

    public void sendGet() {
        try {
            //setting up connection credentials.
            URL muYrl = new URL(this.getUrl());
            HttpURLConnection conn = (HttpURLConnection) muYrl.openConnection();
            conn.setRequestMethod("GET");
            conn.setReadTimeout(5000);

            //read input data
            InputStream in = new BufferedInputStream(conn.getInputStream());
            String result = IOUtils.toString(in);
            System.out.print("\n++++++++++++\n" + result + "\n++++++++++++\n");
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public String sendGetter() {
        String result = "";
        try {
             URL myurl = new URL(this.getUrl());
             HttpURLConnection con = (HttpURLConnection) myurl.openConnection();
             con.setRequestMethod("GET");
             con.setReadTimeout(7000);
             
             InputStream in = new BufferedInputStream(con.getInputStream());
             result = IOUtils.toString(in);
        } catch (Exception ex) {
            System.err.println(ex);
        }

        return result;
    }
}
