package karioPackage;

import java.util.Scanner;

public class karioWorker{
 
    public  void addFriends(){
        karioFrends k = new karioFrends();
        Scanner input = new Scanner(System.in);
        System.out.print("\n----Please fill the following fields.\n----\n");
        
        System.out.print("Friend Names : ");
        k.setName(input.nextLine());
        
        System.out.print("Friend Phone : ");
        k.setPhone(input.nextLine());
       
        System.out.print("Friend Email : ");
        k.setEmail(input.nextLine());
        
        String json = k.getAll();
        
        System.out.println("+++  All is Set: Server will recieve the following :+++\n"+json+"\n+++");
    }

}