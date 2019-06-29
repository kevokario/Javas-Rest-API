package karioPackage;

import org.json.simple.JSONObject;

public class karioLikes {
    private String likeName = "";
    private String likeDesc = "";
    
    public karioLikes(){
        
    }
    public karioLikes(String likename, String likeDesc){
        this.likeDesc = likeDesc;
        this.likeName = likename;
    }
    
    public void setLikeName(String likeName){
        this.likeName = likeName;
    }
    
    public void setLikeDesc(String likeDesc){
        this.likeDesc = likeDesc;
    }
    
    public String getLikeName(){
        return this.likeName;
    }
    
    public String getLikeDesc(){
        return this.likeDesc;
    }
    
    public String getAll(){
        String karioLikes = "";
        JSONObject json = new JSONObject();
        json.put("likename",getLikeName());
        json.put("likedesc", getLikeDesc());
        karioLikes = json.toJSONString();
        return karioLikes;
    }
}
