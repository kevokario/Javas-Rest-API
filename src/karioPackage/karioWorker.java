package karioPackage;

import customHTTPPackage.MyHttp;
import java.util.Scanner;

public class karioWorker {

    Scanner input = new Scanner(System.in);
//    String url = "http://localhost:8080/Demos/KarioRestApi.php?cat=";
    String url = "http://kenyataekwondo.co.ke/HBD/REST_API/KarioRestApi.php?cat=";

    public void addFriends() {
        karioFrends k = new karioFrends();

        System.out.print("\n----[ADD FRIENDS] Please fill the following fields.\n----\n");

        System.out.print("Friend Names : ");
        k.setName(input.nextLine());

        System.out.print("Friend Phone : ");
        k.setPhone(input.nextLine());

        System.out.print("Friend Email : ");
        k.setEmail(input.nextLine());

        String json = k.getAll();
        url = url + "addFriends&json=" + json;
        MyHttp ht = new MyHttp(url, json);
        String results = ht.serverSend();

//        System.out.println("+++ "
//                + " All is Set: Server will recieve the following :\n++++++++++++++++++\n" + json + "\n"
//                + "++++++++++++++++++\n");
        System.out.println("+++ "
                + " All is Set: Server Response :\n++++++++++++++++++\n" + results + "\n"
                + "++++++++++++++++++\n");

    }

    public void addLikes() {
        karioLikes k = new karioLikes();
        System.out.print("\n---- [ADD MY LIKES] Please fill the following fields.\n----\n");

        System.out.print("Like Name : ");
        k.setLikeName(input.nextLine());

        System.out.print("Like Description : ");
        k.setLikeDesc(input.nextLine());

        String json = k.getAll();

        url = url + "addMyLikes&json=" + json;
        MyHttp ht = new MyHttp(url, json);
        String results = ht.serverSend();

        System.out.println("+++ "
                + " All is Set: Server will recieve the following :\n++++++++++++++++++\n" + results + "\n"
                + "++++++++++++++++++\n");

    }

    public void addInfo() {
        karioInfo k = new karioInfo();
        System.out.print("\n---- [ADD A PROFILE] Please fill the following fields.\n----\n");

        System.out.print("First Name : ");
        k.setFname(input.nextLine());

        System.out.print("Second Name : ");
        k.setSname(input.nextLine());

        System.out.print("Last Name : ");
        k.setLname(input.nextLine());

        System.out.print("Phone Number : ");
        k.setPhone(input.nextLine());

        System.out.print("Email Address : ");
        k.setEmail(input.nextLine());

        System.out.print("Username  : ");
        k.setUsername(input.nextLine());

        System.out.print("Password  : ");
        k.setPassword(input.nextLine());

        System.out.print("Occupation Name : ");
        k.setOccupation(input.nextLine());

        System.out.print("Age  : ");
        k.setAge(input.nextInt());

        String json = k.getAll();

        url = url + "addInfo&json=" + json;
        MyHttp ht = new MyHttp(url, json);
        String results = ht.serverSend();

        System.out.println("+++ "
                + " All is Set: Server will recieve the following :\n++++++++++++++++++\n" + results + "\n"
                + "++++++++++++++++++\n");
    }
    
    public void viewFriends(){
        
    }

}
