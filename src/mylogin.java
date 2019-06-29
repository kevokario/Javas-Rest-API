
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class mylogin {

    public static void main(String[] args) throws Exception {
        boolean b = true;
        System.out.println("Welcome");
        while (b) {
            Scanner in = new Scanner(System.in);
            String username = "";
            String password = "";
            String url = "http://localhost:8080/Demos/RestApi.php?cat=userlog";
            int response = 0;

            System.out.print("Enter Username : ");
            username = in.nextLine();
            System.out.print("\nEnter Password : ");
            password = in.nextLine();

            String array[] = {username, password};
            String jsonArray = new myHTTPClass().ArrayToString(array);
            JSONObject json = new JSONObject();
            json.put("username", username);
            json.put("password", password);
            json.put("array", jsonArray);

            String jsonString = json.toJSONString();

            url += "&json=" + jsonString;

            URL uri = new URL(url);
            HttpURLConnection con = (HttpURLConnection) uri.openConnection();

            con.setRequestMethod("GET");
            con.setConnectTimeout(5000);
            con.setRequestProperty("Content-Type", "application/json");
            response = con.getResponseCode();

//            System.out.print("\n+++++\n" + jsonArray + "\n+++++\n");

            InputStream input = new BufferedInputStream(con.getInputStream());
            String result = IOUtils.toString(input);

//            System.out.println("=====\n" + result + "\n=====\n");

            Object ob = JSONValue.parse(result);
            JSONObject object = (JSONObject) ob;
            String status = (String) object.get("result");
            if (status.equals("success")) {
                System.out.println("Success! You are logged in as : " + username+"\n");b = false;
            } else {
                System.out.println("Error, invalid username/password\n\nPlease try again\n");
            }
        }

    }
}
