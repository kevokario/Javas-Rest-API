package customHTTPPackage;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;

public class MyHttp {
    
    private String url = "";
    private String jsonData = "";
    
    public MyHttp(){
        
    }
    
    public MyHttp(String url, String json){
        this.url = url;
        this.jsonData = json;
    }
    
    public void setUrl(String URL){
        this.url = url;
    }
    
    public void setJsonData(String json){
        this.jsonData = json;
    }
    
    public String getJsonData(){
        return this.jsonData;
    }
    
    public String getUrl(){
        return this.url;
    }
    
    public String serverSend(){
        String ServerResults = "";
        try{
            URL myurl = new URL(getUrl());
            HttpURLConnection con = (HttpURLConnection) myurl.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setConnectTimeout(7000);
            
            InputStream in = new BufferedInputStream(con.getInputStream());
           ServerResults =IOUtils.toString(in);
        } catch(Exception ex){
            System.err.println(ex);
        }
        return ServerResults;
    }
}
